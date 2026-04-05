package com.wmware.certification.practice.revision.module1.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Raj, Pushp
 * It covers almost all Spring Expression Language capabilities
 */
@Component
public class SpELComponent {


    @Value("#{434324}") //Literals
    private int literal;

    @Value("#{demoObject.name()}") //Access bean
    private String propertyAccess;

    @Value("#{4+49/7}") //Arithmetic
    private int arithmetic;

    @Value("#{43 > 43}")
    private boolean relational;

    @Value("#{ 4>3 || 2<6}")
    private boolean logical;

    @Value("#{43 > 12 ? 43 : 12}")
    private int ternary;

   public void print(){
      System.out.println("literals: "+literal);
      System.out.println("Access Bean: "+propertyAccess);
      System.out.println("Arithmetic: "+arithmetic);
      System.out.println("Relational: "+relational);
      System.out.println("Logical: "+logical);
      System.out.println("Ternary: "+ternary);
   }
}
