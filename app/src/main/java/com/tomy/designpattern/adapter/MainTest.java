package com.tomy.designpattern.adapter;


import com.tomy.designpattern.adapter.adapter.TurkeyAdapter2;
import com.tomy.designpattern.adapter.duck.IDuck;
import com.tomy.designpattern.adapter.duck.GreenHeadDuck;
import com.tomy.designpattern.adapter.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		IDuck IDuck2TurkeyAdapter =new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		IDuck2TurkeyAdapter.quack();
		IDuck2TurkeyAdapter.fly();
		
	
	}
}
