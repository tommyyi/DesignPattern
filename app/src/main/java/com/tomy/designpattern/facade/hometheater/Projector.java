package com.tomy.designpattern.facade.hometheater;

class Projector
{
    private static Projector instance = null;
    private int size = 5;

    private Projector()
    {

    }

    public static Projector getInstance()
    {
        if (instance == null)
        {
            instance = new Projector();
        }

        return instance;
    }

    public void on()
    {
        System.out.println("Projector On");
    }

    public void off()
    {
        System.out.println("Projector Off");
    }

    public void focus()
    {
        System.out.println("Popcorn is focus");
    }

    public void zoom(int size)
    {
        this.size = size;
        System.out.println("Popcorn zoom to" + size);
    }

}
