package com.leesin;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/4/19 15:00
 * @modified By:
 */
public class PayServiceImpl implements IPayService{
    @Override
    public String pay(String info) {
        System.out.println("execute pay:"+info);
        return "Hello Dubbo:" + info;
    }
}
