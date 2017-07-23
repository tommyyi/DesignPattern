package com.tomy.designpattern.composite;

import com.tomy.designpattern.composite.display.VegetableDisplayStrategy;

public class MainTest
{
    public static void main(String[] args)
    {
        /*初始化服务员*/
        Waitress mWaitress = new Waitress();
        /*初始化蛋糕菜单*/
        CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
        /*初始化正餐菜单*/
        DinnerMenu mDinnerMenu = new DinnerMenu();

        /*添加菜单*/
        mWaitress.addMenuItem(mCakeHouseMenu);
        /*添加菜单*/
        mWaitress.addMenuItem(mDinnerMenu);

        /*显示菜单*/
        mWaitress.printMenu(new VegetableDisplayStrategy());
    }
}
