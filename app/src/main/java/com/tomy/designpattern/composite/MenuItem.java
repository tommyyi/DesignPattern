package com.tomy.designpattern.composite;

/**
 * 一个菜单项是一个菜单
 */
public class MenuItem extends AbsMenuItem
{
    private String name, description;
    private boolean mIsVegetable;
    private float price;

    public MenuItem(String name, String description, boolean mIsVegetable, float price)
    {
        super();
        this.name = name;
        this.description = description;
        this.mIsVegetable = mIsVegetable;
        this.price = price;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public float getPrice()
    {
        return price;
    }

    @Override
    public boolean isVegetable()
    {
        return mIsVegetable;
    }
}
