package com.vmware.certification.practice.revision.module2.AOP_demo.pointcuts.joinpoints;

import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * demostrate execution point cut expression
 */
@Component
public class ExecutionJoinPoint {

    public void executionJoinPoint(){
        System.out.println("Execution Join Point method");
    }
}
