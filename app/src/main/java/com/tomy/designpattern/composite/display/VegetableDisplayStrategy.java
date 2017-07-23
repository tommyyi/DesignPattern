package com.tomy.designpattern.composite.display;

import com.tomy.designpattern.composite.AbsMenuItem;
import com.tomy.designpattern.composite.CakeHouseMenu;
import com.tomy.designpattern.composite.DinnerMenu;
import com.tomy.designpattern.composite.MenuItem;
import com.tomy.designpattern.composite.SubMenu;

/**
 * Created by 易剑锋 on 2017/7/23.
 */

public class VegetableDisplayStrategy implements IDisplayStrategy
{
    /**
     * 根据不同的类型进行显示
     */
    @Override
    public void handle(AbsMenuItem absMenuItem)
    {
        if(absMenuItem instanceof CakeHouseMenu)
        {
            for(AbsMenuItem item: ((CakeHouseMenu) absMenuItem).getMenuItemList())
            {
                item.display(this);
            }
        }
        else if(absMenuItem instanceof DinnerMenu)
        {
            for(AbsMenuItem item: ((DinnerMenu) absMenuItem).getAbsMenuItems())
            {
                item.display(this);
            }
        }
        else if(absMenuItem instanceof SubMenu)
        {
            for(AbsMenuItem item: ((SubMenu) absMenuItem).getMenuItemList())
            {
                item.display(this);
            }
        }
        else if(absMenuItem instanceof MenuItem)
        {
            MenuItem menuItem = (MenuItem) absMenuItem;
            if (menuItem.isVegetable())
            {
                System.out.print(menuItem.getName()+"--"+menuItem.getDescription()+"\r\n\r\n");
            }
        }
    }
}
