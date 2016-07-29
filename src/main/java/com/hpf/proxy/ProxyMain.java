package com.hpf.proxy;

/**
 * Created by hanpengfei on 2016/7/8.
 */
public class ProxyMain {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) new MyProxy(helloService).getProxy();
        proxy.sayHello();
    }
}
