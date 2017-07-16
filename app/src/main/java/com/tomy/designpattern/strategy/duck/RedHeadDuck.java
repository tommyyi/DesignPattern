package com.tomy.designpattern.strategy.duck;

import com.tomy.designpattern.strategy.flybehavior.BadFlyBehavior;
import com.tomy.designpattern.strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mIFlyBehavior = new BadFlyBehavior();
		mIQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**RedHead**");
	}

}
