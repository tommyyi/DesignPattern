package com.tomy.designpattern.decorator.coffeebar;

public abstract class Drink
{
    public String description = "";
    private float price = 0f;

    public void setDescription(String description)
    {
        this.description = description;
    }

    /**自身的描述+自身的价格
     * @return
     */
    public String getDescription()
    {
        return this.description + "-" + this.getPrice();
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public abstract float cost();
}
