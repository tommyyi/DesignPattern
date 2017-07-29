package com.tomy.designpattern.proxy.candymachine;

import java.io.Serializable;

public interface IState extends Serializable
{
    void insertCoin();
    void returnCoin();
    void turnCrank();
    void dispense();
    void printCurrentState();
    String getCurrentStateName();
}
