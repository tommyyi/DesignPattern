package com.tomy.designpattern.adapter.turkey;

public class WildTurkey implements ITurkey
{

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println(" Go Go");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a short distance");
	}

}
