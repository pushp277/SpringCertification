package com.vmware.certification.practice.revision.module2.AOP_demo;

import com.vmware.certification.practice.revision.module2.AOP_demo.advice.Advice1;
import com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints.*;
import com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.pointcut.PointCutExpressions;
import com.vmware.certification.practice.revision.module2.AOP_demo.joinPoints.join1.JoinPoint1;
import com.vmware.certification.practice.revision.module2.AOP_demo.joinPoints.join2.Join2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Raj, Pushp
 * Demo for PointCut, JoinPoint and Advice
 * @see Advice1
 * @see JoinPoint1
 * for PointCut Expression {@link PointCutExpressions}
 */
@ComponentScan
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);


        JoinPoint1 jp1 = (JoinPoint1) context.getBean("joinPoint1");
        jp1.callJoinPointMethod1();
        jp1.callJoinPointMethod2("Pushp");


        Join2 jp2 = (Join2) context.getBean("join2");
        jp2.afterReturnMethod();
        try {
            jp2.afterThrowingMethod();
        }
        catch(Exception ex){

        }

        System.out.println("=== Demo of Point Cut ===");

        System.out.println("== Expression ==");
        ExecutionJoinPoint ejp = (ExecutionJoinPoint) context.getBean("executionJoinPoint");
        ejp.executionJoinPoint();

        System.out.println("== Within ==");
        WithinJoinPoint wjp = (WithinJoinPoint) context.getBean("withinJoinPoint");
        wjp.withinMethod1();
        wjp.whtinMethod2("Pushp");

        System.out.println("== Bean ==");
        BeanJoinPoint bjp = (BeanJoinPoint) context.getBean("beanJoinPoint");
        bjp.beanJoinPoint();

        System.out.println("== Args ==");
        ArgsJoinPoint ajp = (ArgsJoinPoint) context.getBean("argsJoinPoint");
        ajp.argsJoinPointMethod1("Pushp");

        System.out.println("== This ==");
        ThisJoinPoint tjp = (ThisJoinPoint) context.getBean("thisJoinPointImpl");
        tjp.thisJoinPoint();


        System.out.println("== @annotation ==");
        AnnotationJoinPoint anjp = (AnnotationJoinPoint) context.getBean("annotationJoinPoint");
        anjp.annotationJoinPoint();

        System.out.println("== @within ==");
        WithinAnnotationJoinPoint wajp = (WithinAnnotationJoinPoint) context.getBean("withinAnnotationJoinPoint");
        wajp.withinAnnotationJoinPoint();

        System.out.println("== @args ==");
        ArgsAnnotationJoinPoint aajp = (ArgsAnnotationJoinPoint) context.getBean("argsAnnotationJoinPoint");
        aajp.argsAnnotationJoinPoint(new ArgsAnnotation());

        System.out.println("== @target ==");
        TargetAnnotation ta =  context.getBean(TargetAnnotation.class);
        ta.execution();
    }
}
