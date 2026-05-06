package com.vmware.certification.practice.revision.module2.cglibProxy;

import com.vmware.certification.practice.revision.module2.cglibProxy.methodInterceptor.MyMethodIntercepter;
import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Demo.class);
        enhancer.setCallback(new MyMethodIntercepter());


        Demo demo = (Demo) enhancer.create();
        demo.getName();
    }
}
