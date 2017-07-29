package com.tomy.designpattern.builder.builder;


import com.tomy.designpattern.builder.vacation.Vacation;
import com.tomy.designpattern.builder.vacation.VacationDay;

public abstract class AbsBuilder
{
    public Vacation mVacation;

    public AbsBuilder(String startDay)
    {
        mVacation = new Vacation(startDay);
    }

    public abstract void buildVacation();

    public final VacationDay getVacationDay(int i)
    {
        return mVacation.getVacationDay(i);
    }

    public final AbsBuilder addHotel(VacationDay vacationDay, String hotel)
    {
        mVacation.setHotel(vacationDay, hotel);
        return this;
    }

    public final AbsBuilder addTicket(VacationDay vacationDay, String ticket)
    {
        mVacation.addTicket(vacationDay, ticket);
        return this;
    }

    public final AbsBuilder addEvent(VacationDay vacationDay, String event)
    {
        mVacation.addEvent(vacationDay, event);
        return this;
    }

    public final Vacation getVacation()
    {
        return mVacation;
    }

    public final VacationDay addVacationDay()
    {
        return mVacation.addVacationDay();
    }
}
