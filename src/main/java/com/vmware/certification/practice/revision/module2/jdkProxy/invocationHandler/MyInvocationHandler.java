package com.vmware.certification.practice.revision.module2.jdkProxy.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private final Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Exception{
        System.out.println("method name called in JDK dynamic Proxy: "+method.getName());

        Object result = method.invoke(target, args);

        return result;
    }
}
