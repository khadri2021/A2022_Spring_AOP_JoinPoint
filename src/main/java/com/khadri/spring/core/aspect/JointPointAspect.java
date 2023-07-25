package com.khadri.spring.core.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JointPointAspect {

    @Around("execution(Integer com.khadri.spring.core.dao.StudentDao.findById(Integer))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Advice");

        System.out.println(joinPoint);
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getTarget());
        joinPoint.proceed();

        System.out.println("After Advice");
    }
}
