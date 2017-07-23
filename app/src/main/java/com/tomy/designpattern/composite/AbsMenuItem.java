package com.tomy.designpattern.composite;

import com.tomy.designpattern.composite.display.IDisplayStrategy;

/**
 * 抽象菜单项
 */
public abstract class AbsMenuItem
{
    public abstract String getName();
    public abstract String getDescription();
    public abstract float getPrice();

    public boolean isVegetable()
    {
        return false;
    }

    public final void display(IDisplayStrategy displayStrategy)
    {
        displayStrategy.handle(this);
    }
}
