package com.vmware.certification.practice.revision.module2.jdkProxy;

import com.vmware.certification.practice.revision.module2.jdkProxy.impl.DemoImpl;
import com.vmware.certification.practice.revision.module2.jdkProxy.invocationHandler.MyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author Raj, Pushp
 */
public class Main {
    public static void main(String[] args) {
        Demo demo = new DemoImpl();

        Demo demoProxy = (Demo)Proxy.newProxyInstance(
            demo.getClass().getClassLoader(),
                new Class[]{Demo.class},
                new MyInvocationHandler(demo)
        );

        demoProxy.printNameString();
    }
}
