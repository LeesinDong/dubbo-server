package com.leesin;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/5/1 8:15
 * @modified By:
 */
public class PayServiceImpl2 implements IPayService{
    @Override
    public String pay(String info) {
        System.out.println("execute pay:"+info);
        return "Hello Dubbo:" + info;
    }
}