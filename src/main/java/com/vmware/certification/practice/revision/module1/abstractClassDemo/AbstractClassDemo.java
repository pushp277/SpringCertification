package com.vmware.certification.practice.revision.module1.abstractClassDemo;

/**
 * @author Raj, Pushp
 * Demontract Abstract Method
 */
public abstract class AbstractClassDemo {

    //It can have it's own constructor
    public AbstractClassDemo(){
        System.out.println("AbstractClassInstance");
    }

    //Implementing Abstract Method
    abstract void abstractMethod();

    //Implementing Concrete Method
    public void concreateMethod(){
        System.out.println("ConcreteMethod");
    }

    //Implementing private Concrete Method
    private void concreatePrivateMethod(){
        System.out.println("ConcreatePrivateMethod");
    }

    protected void concreteProtectedMethod(){
        System.out.println("ConcreateProtectedMethod");
    }

}
