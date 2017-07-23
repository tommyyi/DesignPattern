package com.tomy.designpattern.composite;

import java.util.ArrayList;

public class SubMenu extends AbsMenuItem
{
    private ArrayList<AbsMenuItem> menuItems;

    public SubMenu()
    {
        super();
        menuItems = new ArrayList<>();

        addItem("Apple Cookie", "Apple&candy&Cookie", true, 1.99f);
        addItem("Banana Cookie", "Banana&candy&Cookie", false, 1.59f);
        addItem("Orange Cookie", "Orange&Cookie", true, 1.29f);
    }

    private void addItem(String name, String description, boolean vegetable, float price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }

    @Override
    public String getName()
    {
        return "Cookies";
    }

    @Override
    public String getDescription()
    {
        return "we provide all kinds of cookies";
    }

    @Override
    public float getPrice()
    {
        return 0;
    }

    public ArrayList<AbsMenuItem> getMenuItemList()
    {
        return menuItems;
    }
}
