package com.vmware.certification.practice.revision.module1.interfaceDemo;

/**
 * @author Raj, Pushp
 * delcaring action, that Object implementing the interface needs to implement
 *
 * Types of Interfaces 1. Functional Interface -> only one abstract method, Marker Interface -> no methods
 */
public interface InterfaceDemo {
    String literal = "public final Static Variable"; //It is converted to public static final at the run time

    //Method need to be implemented by Class implementing this interface
    void abstractMethod();

    //It is introduced in Java 8
    // It's a method which can be overridden at the run time
    default void concreateMethod(){
        System.out.println("ConcreteMethod");
    }

    public static void staticMethod(){ //This belongs to the Interface
        System.out.println("inside statid Method:" + literal);
        System.out.println("StaticMethod");
    }

    //It is intorduced in Java 9
    // act as a Helper method for default method
    private void Helper(){
        System.out.println("PrivateMethod");
    }
}
