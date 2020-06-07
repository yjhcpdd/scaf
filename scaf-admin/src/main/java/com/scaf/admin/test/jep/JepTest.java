package com.scaf.admin.test.jep;

import org.nfunk.jep.JEP;

public class JepTest {
    
    public static void main(String[] args) {
        String expression="(a+b)*b-1";
        JEP jep=new JEP();
        //(1)设置变量
        jep.addVariable("a",1);
        jep.addVariable("b",2);
        //(2)转换表达式
        jep.parseExpression(expression);
        //(3)获取表达式的值
        double result=jep.getValue();
        System.out.println(result);
    }
    
}
