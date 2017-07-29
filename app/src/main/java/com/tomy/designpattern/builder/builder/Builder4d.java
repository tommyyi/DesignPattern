package com.tomy.designpattern.builder.builder;


import com.tomy.designpattern.builder.vacation.VacationDay;

public class Builder4d extends AbsBuilder
{
    public Builder4d(String std)
    {
        super(std);
    }

    @Override
    public void buildVacation()
    {
        VacationDay vacationDay = addVacationDay();
        addTicket(vacationDay, "Plane Ticket");
        addEvent(vacationDay, "Fly to Destination");
        addEvent(vacationDay, "Supper");
        addHotel(vacationDay, "Hilton");

        vacationDay = addVacationDay();
        addTicket(vacationDay, "Zoo Ticket");
        addEvent(vacationDay, "Bus to Zoo");
        addEvent(vacationDay, "Feed animals");
        addHotel(vacationDay, "Hilton");

        vacationDay = addVacationDay();
        addTicket(vacationDay, "Beach");
        addEvent(vacationDay, "Swimming");
        addHotel(vacationDay, "Home inn");

        vacationDay = addVacationDay();
        addTicket(vacationDay, "Plane Ticket");
        addEvent(vacationDay, "Fly to Home");
    }
}
