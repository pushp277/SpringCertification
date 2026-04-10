package com.wmware.certification.practice.revision.module2.AOP_demo;

import com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1.JoinPoint1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Raj, Pushp
 * Demo for PointCut, JoinPoint and Advice
 * @see com.wmware.certification.practice.revision.module2.AOP_demo.advice.Advice1
 * @see JoinPoint1
 */
@ComponentScan
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        JoinPoint1 jp1 = (JoinPoint1) context.getBean("joinPoint1");
        jp1.callJoinPointMethod1();
        jp1.callJoinPointMethod2("Pushp");
    }
}
