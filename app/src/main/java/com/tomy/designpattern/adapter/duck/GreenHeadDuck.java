package com.tomy.designpattern.adapter.duck;

public class GreenHeadDuck implements IDuck
{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println(" Ga Ga");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a long distance");
	}

}
