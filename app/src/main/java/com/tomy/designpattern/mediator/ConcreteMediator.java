package com.tomy.designpattern.mediator;

import java.util.HashMap;

public class ConcreteMediator implements IMediator
{
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator()
    {
        colleagueMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague)
    {
        colleagueMap.put(colleagueName, colleague);
    }

    @Override
    public void sendMessage(String colleagueName, int colleagueState)
    {
        if (colleagueMap.get(colleagueName) instanceof Alarm)
        {
            if (colleagueState == 0)
            {
            }
            else if (colleagueState == 1)
            {
            }
        }
        else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine)
        {
        }
        else if (colleagueMap.get(colleagueName) instanceof TV)
        {
        }
        else if (colleagueMap.get(colleagueName) instanceof Curtains)
        {
        }
    }
}
