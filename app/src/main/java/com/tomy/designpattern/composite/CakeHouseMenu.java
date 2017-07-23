package com.tomy.designpattern.composite;

import java.util.ArrayList;

public class CakeHouseMenu extends AbsMenuItem
{
    public ArrayList<AbsMenuItem> getMenuItemList()
    {
        return mMenuItemList;
    }

    private ArrayList<AbsMenuItem> mMenuItemList;

    public CakeHouseMenu()
    {
        super();
        mMenuItemList = new ArrayList<>();

        /*添加菜单项*/
        addMenuItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
        addMenuItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
        addMenuItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
        addMenuItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
    }

    /**添加菜单项
     * @param name
     * @param description
     * @param isVegetable
     * @param price
     */
    private void addMenuItem(String name, String description, boolean isVegetable, float price)
    {
        MenuItem menuItem = new MenuItem(name, description, isVegetable, price);
        mMenuItemList.add(menuItem);
    }

    @Override
    public String getName()
    {
        return "CakeHouseMenu";
    }

    @Override
    public String getDescription()
    {
        return "here, we provide various cake";
    }

    @Override
    public float getPrice()
    {
        return 0;
    }
}
