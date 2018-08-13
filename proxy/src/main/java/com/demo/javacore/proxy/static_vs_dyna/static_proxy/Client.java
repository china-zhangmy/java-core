package com.demo.javacore.proxy.static_vs_dyna.static_proxy;

import com.demo.javacore.proxy.static_vs_dyna.Subject;

public class Client {

    public static void main(String[] args) {
        Subject proxy = StaticProxyFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }

}
