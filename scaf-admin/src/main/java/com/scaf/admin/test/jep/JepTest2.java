package com.scaf.admin.test.jep;

import org.nfunk.jep.JEP;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.PostfixMathCommand;

import java.util.Stack;

public class JepTest2 {
    
    public static class MyFun extends PostfixMathCommand{
        public MyFun(){
            //初始化参数格式（如参数个数为变长，测为-1）
            super.numberOfParameters = 1;
        }
        @Override
        public void run(Stack stack) throws ParseException {
            //检查栈
            this.checkStack(stack);
            //出栈
            Object obj = stack.pop();
            //计算结果入栈
            stack.push(this.myMethod(obj));
        }
        private Object myMethod(Object obj) throws ParseException{
            if(obj instanceof Number){
                double inputParam=((Number) obj).doubleValue();
                if(inputParam<0){
                    return new Double("0.00");
                }else{
                    return new Double(inputParam);
                }
            }else{
                throw new ParseException("Invalid parameter type");
            }
        }
    }
    
    public static void main(String[] args) {
        JEP jep=new JEP();
        //引入标准函数
        jep.addFunction("myFun01",new MyFun());
        jep.parseExpression("myFun01(10)");
        System.out.println(jep.getValue());
        jep.parseExpression("myFun01(-9)");
        System.out.println(jep.getValue());
        //执行结果为10  0
    }
    
}
