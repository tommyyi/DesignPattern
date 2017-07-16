package com.tomy.designpattern.strategy;


import com.tomy.designpattern.strategy.duck.Duck;
import com.tomy.designpattern.strategy.duck.GreenHeadDuck;
import com.tomy.designpattern.strategy.duck.RedHeadDuck;
import com.tomy.designpattern.strategy.flybehavior.NoFlyBehavior;
import com.tomy.designpattern.strategy.quackbehavior.NoQuackBehavior;

public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
