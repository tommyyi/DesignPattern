package com.tomy.designpattern.singleton;

public class Singleton
{
    private static Singleton uniqueInstance = null;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (uniqueInstance == null)
        {
            synchronized (Singleton.class)
            {
                if (uniqueInstance==null)
                {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
