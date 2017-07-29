package com.tomy.designpattern.builder.builder;


import com.tomy.designpattern.builder.vacation.Vacation;
import com.tomy.designpattern.builder.vacation.VacationDay;

public class BuilderSelf
{
    public Vacation mVacation;

    public BuilderSelf(String startDay)
    {
        mVacation = new Vacation(startDay);
    }

    public VacationDay addDay()
    {
        return mVacation.addVacationDay();
    }

    public VacationDay getVacationDay(int index)
    {
        return mVacation.getVacationDay(index);
    }

    public BuilderSelf addHotel(VacationDay vacationDay, String hotel)
    {
        mVacation.setHotel(vacationDay, hotel);
        return this;
    }

    public BuilderSelf addTicket(VacationDay vacationDay, String ticket)
    {
        mVacation.addTicket(vacationDay, ticket);
        return this;
    }

    public BuilderSelf addEvent(VacationDay vacationDay, String event)
    {
        mVacation.addEvent(vacationDay, event);
        return this;
    }

    public Vacation getVacation()
    {
        return mVacation;
    }
}
