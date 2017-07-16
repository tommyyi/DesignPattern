package com.tomy.designpattern.observer.mode;

import com.tomy.designpattern.observer.observer.IObserver;
import com.tomy.designpattern.observer.observer.ISubject;

import java.util.ArrayList;

public class WeatherDataSt implements ISubject
{
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<IObserver> mIObservers;
	public WeatherDataSt()
	{
		mIObservers =new ArrayList<IObserver>();
	}
	
	public float getTemperature()
	{
		return mTemperatrue;
		
	}
	
	public float getPressure()
	{
		return mPressure;
		
	}
	
	public float getHumidity()
	{
		return mHumidity;
		
	}
	public void dataChange()
	{
		notifyObservers();
	}

	

	
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}

	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		mIObservers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		if(mIObservers.contains(o))
		{
			mIObservers.remove(o);}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0, len = mIObservers.size(); i<len; i++)
		{
			mIObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
		}
	}

}
