package com.wmware.certification.practice.revision.module2.AOP_demo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {

    @Around("execution(* com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join2.*.*(..) throws java.lang.Exception)")
    public void aroundMehtod(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Around Method is called before actual method call");
        try{
           pjp.proceed();
           System.out.println("Around method is being called after successful method call");
        }
        catch(Exception ex){
            System.out.println("Around method is being called for Exception: "+pjp.getSignature().getName());
        }

    }
}
