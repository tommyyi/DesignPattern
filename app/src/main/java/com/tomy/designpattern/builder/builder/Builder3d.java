package com.tomy.designpattern.builder.builder;


import com.tomy.designpattern.builder.vacation.VacationDay;

public class Builder3d extends AbsBuilder
{
    public Builder3d(String std)
    {
        super(std);
    }

    @Override
    public void buildVacation()
    {
        VacationDay vacationDay = addVacationDay();
        addTicket(vacationDay, "Plane Ticket")
        .addEvent(vacationDay, "Fly to Destination")
        .addEvent(vacationDay, "Supper")
        .addEvent(vacationDay, "Dancing")
        .addHotel(vacationDay, "Four Seasons");

        vacationDay = addVacationDay();
        addTicket(vacationDay, "Theme Park")
        .addEvent(vacationDay, "Bus to Park")
        .addEvent(vacationDay, "lunch")
        .addHotel(vacationDay, "Four Seasons");

        vacationDay = addVacationDay();
        addTicket(vacationDay, "Plane Ticket")
        .addEvent(vacationDay, "City Tour")
        .addEvent(vacationDay, "Fly to Home");
    }
}
