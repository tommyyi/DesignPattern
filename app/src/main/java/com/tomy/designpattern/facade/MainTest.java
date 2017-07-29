package com.tomy.designpattern.facade;


import com.tomy.designpattern.facade.hometheater.HomeTheaterFacade;

public class MainTest
{
    public static void main(String[] args)
    {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
