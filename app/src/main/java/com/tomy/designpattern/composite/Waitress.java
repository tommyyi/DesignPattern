package com.tomy.designpattern.composite;

import com.tomy.designpattern.composite.display.IDisplayStrategy;

import java.util.ArrayList;

public class Waitress
{
    private ArrayList<AbsMenuItem> mAbsMenuItemList = new ArrayList<>();

    public Waitress()
    {
    }

    public void addMenuItem(AbsMenuItem mAbsMenuItem)
    {
        mAbsMenuItemList.add(mAbsMenuItem);
    }

    public void printMenu(IDisplayStrategy iDisplayStrategy)
    {
        for (int i = 0, len = mAbsMenuItemList.size(); i < len; i++)
        {
            mAbsMenuItemList.get(i).display(iDisplayStrategy);
        }
    }
}