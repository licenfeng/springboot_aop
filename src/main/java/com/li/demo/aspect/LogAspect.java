package com.li.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2019/4/26.
 *
 * @Author user
 */
@Aspect
@Component
public class LogAspect<T> {
    /**
     * 定义切入点，切入点为com.li.demo.service.类下的所有函数
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    //@Pointcut(value = "execution(public * com.li.demo.service.*.*(..))&& args(param ,..)")
    @Pointcut(value = "within(com.li.demo.service..*)&& args(param ,..)")
    public void loggin(T param){
   }

    /**
     * 前置通知：在连接点之前执行的通知
     * @throws Throwable
     */
    @Before("loggin(param)")
    public void doBefore(T param) throws Throwable {
        logger.info(param.toString()+"===========before=========");
    }

    @AfterReturning(returning = "ret",pointcut = "loggin(param)")
    public void doAfterReturning(T param,Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info(param+"RESPONSE=============after : " + ret);
    }

    @Around( "com.li.demo.aspect.LogAspect.loggin(param)")
    public Object doBasicProfiling(ProceedingJoinPoint pjp,T param) throws Throwable {
        logger.info(param.toString()+"===========Around before=========");
        // start stopwatch 环绕方法前执行
        Object retVal = pjp.proceed();
        // stop stopwatch 环绕方法后执行
        logger.info(retVal+"===========Around after=========");
        return retVal;
    }

    @AfterThrowing( pointcut="loggin(param)", throwing="ex")
    public void doRecoveryActions(Exception ex,T param) {
        logger.error(ex.getMessage());
    }
}
