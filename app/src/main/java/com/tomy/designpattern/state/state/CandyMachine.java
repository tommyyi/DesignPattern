package com.tomy.designpattern.state.state;

public class CandyMachine {

	IState mSoldOutIState;
	IState mOnReadyIState;
	IState mHasCoin;
	IState mSoldIState;
	IState mWinnerIState;
	private IState mIState;
	private int count = 0;

	public CandyMachine(int count) {
		this.count = count;
		mSoldOutIState = new SoldOutState(this);
		mOnReadyIState = new OnReadyState(this);
		mHasCoin = new HasCoin(this);
		mSoldIState = new SoldState(this);
		mWinnerIState = new WinnerState(this);
		if (count > 0) {
			mIState = mOnReadyIState;
		} else {
			mIState = mSoldOutIState;
		}
	}

	public void setIState(IState IState) {
		this.mIState = IState;
	}

	public void insertCoin() {
		mIState.insertCoin();
	}

	public void returnCoin() {
		mIState.returnCoin();
	}

	public void turnCrank() {
		mIState.turnCrank();
		mIState.dispense();
	}

	void releaseCandy() {

		// TODO Auto-generated method stub
		if (count > 0) {
			count = count - 1;
			System.out.println("a candy rolling out!");
		}

	}

	public int getCount() {
		return count;
	}

	public void printstate() {
		mIState.printstate();
	}
}
