package com.scaf.admin.test.jep;

import org.nfunk.jep.JEP;

public class JepTest3 {
    
    public static void main(String[] args) {
        JEP jep=new JEP();
        jep.parseExpression("1+-*2");
        if(jep.hasError()){
            System.out.println("计算出错："+jep.getErrorInfo());
        }else{
            System.out.println("结果："+jep.getValue());
        }
    }
    
}
