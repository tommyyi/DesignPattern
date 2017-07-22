package com.tomy.designpattern.state.state;

public class OnReadyState implements IState
{
	private CandyMachine mCandyMachine;
	public OnReadyState(CandyMachine mCandyMachine)
	{
		this.mCandyMachine=mCandyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out
		.println("you have inserted a coin,next,please turn crank!");
		mCandyMachine.setIState(new HasCoin(mCandyMachine));
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned,but you haven't inserted a coin!");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***OnReadyState***");
		
	}

}
