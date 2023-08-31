package com.atguigu.proxyTest.statics;

import com.atguigu.proxyTest.Calculator;

//静态代理类
/*
需要手动创建代理类，为每个目标类手动创建一个代理类，很麻烦
 */
public class CalculatorStaticProxy implements Calculator {

    private Calculator target;

    public CalculatorStaticProxy(Calculator target){
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("CalculatorStaticProxy.add--before...");
        int result = target.add(i, j);
        System.out.println("CalculatorStaticProxy.add--after...");
        return result;
    }

    @Override
    public int subtract(int i, int j) {
        return 0;
    }

    @Override
    public int multiply(int i, int j) {
        return 0;
    }

    @Override
    public int divide(int i, int j) {
        return 0;
    }
}
