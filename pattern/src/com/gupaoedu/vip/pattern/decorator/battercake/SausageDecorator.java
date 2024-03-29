package com.gupaoedu.vip.pattern.decorator.battercake;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake){
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg(){
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice(){
        return super.getPrice() + 2;
    }



}
