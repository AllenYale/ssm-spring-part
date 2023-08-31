package com.atguigu.proxyTest;

import com.atguigu.proxyTest.statics.CalculatorStaticProxy;

public class Test {

    @org.junit.jupiter.api.Test
    public void test01_static_proxy_test(){
        Calculator calculator = new CalculatorImpl();
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(calculator);
        System.out.println(calculatorStaticProxy.add(1, 1));
    }
}
