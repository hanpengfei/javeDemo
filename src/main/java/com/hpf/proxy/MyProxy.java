package com.hpf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hanpengfei on 2016/7/8.
 */
public class MyProxy implements InvocationHandler {

    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(HelloService.class.getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
