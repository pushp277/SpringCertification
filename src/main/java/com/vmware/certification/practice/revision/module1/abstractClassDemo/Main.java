package com.vmware.certification.practice.revision.module1.abstractClassDemo;

/**
 * @author Raj, Pushp
 * Abstract Class Demo
 */
public class Main extends AbstractClassDemo{

    @Override
    public void abstractMethod(){
        System.out.println("AbstractMethod");
    }

    public static void main(String[] args){
        new Main().concreateMethod();
        new Main().abstractMethod();
        new Main().concreteProtectedMethod();
    }

}
