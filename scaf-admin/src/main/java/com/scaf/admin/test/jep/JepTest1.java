package com.scaf.admin.test.jep;

import org.nfunk.jep.JEP;

public class JepTest1 {
    
    public static void main(String[] args) {
        JEP jep=new JEP();
        //引入标准函数
        jep.addStandardFunctions();
        jep.parseExpression("sum(1,2)");
        double result=jep.getValue();
        System.out.println(result);
    }
    
}
