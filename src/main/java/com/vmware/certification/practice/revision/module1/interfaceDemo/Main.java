package com.vmware.certification.practice.revision.module1.interfaceDemo;


/**
 * @author Raj, Pushp
 * Demo for Interface
 * @see InterfaceDemo
 */
public class Main implements InterfaceDemo{

    @Override
    public void abstractMethod(){
       System.out.println("AbstractMethod");
    }

    public static void main(String[] args){
        //Accessing Static Variable
       System.out.println(Main.literal);

       //Interface can only access Static Method
       InterfaceDemo.staticMethod(); // It belonds to the interface only

        //Instance of Main can access abstractMethod
        (new Main()).abstractMethod();

        //Instance of Main can access concreteMethod
        (new Main()).concreateMethod();

    }
}
