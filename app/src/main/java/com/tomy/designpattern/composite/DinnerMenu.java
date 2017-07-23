package com.tomy.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu extends AbsMenuItem
{
    private final static int MAX_MENU_ITEMS = 5;
    private int mNumberOfMenuItems = 0;

    public List<AbsMenuItem> getAbsMenuItems()
    {
        return mAbsMenuItems;
    }

    private List<AbsMenuItem> mAbsMenuItems;

    public DinnerMenu()
    {
        super();
        mAbsMenuItems = new ArrayList<>(5);
        addMenuItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
        addMenuItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
        addMenuItem("bean soup", "bean&potato salad", true, 3.28f);
        addMenuItem("hotdog", "onions&cheese&bread", false, 3.05f);
        addSubMenuItem(new SubMenu());
    }

    private void addMenuItem(String name, String description, boolean vegetable, float price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if (mNumberOfMenuItems >= MAX_MENU_ITEMS)
        {
            System.err.println("sorry,menu is full!can not add another item");
        }
        else
        {
            mAbsMenuItems.add(menuItem);
            mNumberOfMenuItems++;
        }
    }

    /**
     * @param mAbsMenuItem 被添加的子菜单
     */
    private void addSubMenuItem(AbsMenuItem mAbsMenuItem)
    {
        if (mNumberOfMenuItems >= MAX_MENU_ITEMS)
        {
            System.err.println("sorry,menu is full!can not add another item");
        }
        else
        {
            mAbsMenuItems.add(mAbsMenuItem);
            mNumberOfMenuItems++;
        }
    }

    @Override
    public String getName()
    {
        return "DinnerMenu";
    }

    @Override
    public String getDescription()
    {
        return "here, we provide various kind of dinner";
    }

    @Override
    public float getPrice()
    {
        return 0;
    }
}
