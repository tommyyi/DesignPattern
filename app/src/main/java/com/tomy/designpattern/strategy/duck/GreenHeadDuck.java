package com.tomy.designpattern.strategy.duck;

import com.tomy.designpattern.strategy.flybehavior.GoodFlyBehavior;
import com.tomy.designpattern.strategy.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mIFlyBehavior = new GoodFlyBehavior();
		mIQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}