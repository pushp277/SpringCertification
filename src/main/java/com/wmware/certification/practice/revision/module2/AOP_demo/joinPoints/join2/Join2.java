package com.wmware.certification.practice.revision.module2.AOP_demo.joinPoints.join2;

import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * Demostrated AfterReturning, AfterThrowing, Around
 */
@Component
public class Join2 {

    public void afterReturnMethod(){
        System.out.println("After Returning Method is being called");
    }

    public void afterThrowingMethod() throws Exception{
        throw new Exception("After Throwing Method is being called");
    }


}
