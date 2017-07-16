package com.tomy.designpattern.strategy.duck;

import com.tomy.designpattern.strategy.flybehavior.IFlyBehavior;
import com.tomy.designpattern.strategy.quackbehavior.IQuackBehavior;

public abstract class Duck {

	IFlyBehavior mIFlyBehavior;
	IQuackBehavior mIQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mIFlyBehavior.fly();
	}

	public void Quack() {
		mIQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(IQuackBehavior qb) {
		mIQuackBehavior = qb;
	}

	public void SetFlyBehavoir(IFlyBehavior fb) {
		mIFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}
