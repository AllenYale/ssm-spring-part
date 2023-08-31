package com.atguigu.proxyTest;
//目标类
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        System.out.println("CalculatorImpl.add" + i + "+" + j + "=" + (i+j));
        return i + j;
    }

    @Override
    public int subtract(int i, int j) {
        return i - j;
    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }

    @Override
    public int divide(int i, int j) {
        return i / j;
    }
}
