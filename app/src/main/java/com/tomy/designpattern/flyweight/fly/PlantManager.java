package com.tomy.designpattern.flyweight.fly;

public class PlantManager
{
    private int length = 10000000;
    private int[] xArray = new int[length];//x坐标属性集中存储
    private int[] yArray = new int[length];//y坐标属性集中存储
    private int[] AgeArray = new int[length];//age属性集中存储
    private int[] typeArray = new int[length];//类型属性集中存储
    private PlantFactory mPlantFactory;

    public PlantManager()
    {
        mPlantFactory = new PlantFactory();
        for (int i = 0; i < length; i++)
        {
            xArray[i] = (int) (Math.random() * length);
            yArray[i] = (int) (Math.random() * length);
            AgeArray[i] = (int) (Math.random() * length) % 5;
            typeArray[i] = (int) (Math.random() * length) % 2;
        }
    }

    public void displayTrees()
    {
        for (int i = 0; i < length; i++)
        {
            mPlantFactory.getPlant(typeArray[i]).display(xArray[i], yArray[i], AgeArray[i]);
        }
    }
}
