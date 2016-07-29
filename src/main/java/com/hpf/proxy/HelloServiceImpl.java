package com.hpf.proxy;

/**
 * Created by hanpengfei on 2016/7/8.
 */
public class HelloServiceImpl  implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
