package com.wmware.certification.practice.revision.module2.cglibProxy.methodInterceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodIntercepter implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable{
        System.out.println("Method name called in CGLIB proxy: "+method.getName());
        Object result = methodProxy.invokeSuper(o, args);

        return result;
    }
}
