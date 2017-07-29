package com.tomy.designpattern.builder;


import com.tomy.designpattern.builder.builder.Builder3d;
import com.tomy.designpattern.builder.builder.Builder4d;
import com.tomy.designpattern.builder.builder.BuilderSelf;
import com.tomy.designpattern.builder.vacation.VacationDay;

public class MainTest
{
    public static void main(String[] args)
    {
        String startDay = "2015-12-29";
        Director mDirector = new Director(new Builder4d(startDay));
        mDirector.construct();

        startDay = "2015-8-30";
        mDirector.setBuilder(new Builder3d(startDay));
        mDirector.construct();

        testself();
    }

    public static void testself()
    {
        BuilderSelf builder = new BuilderSelf("2015-9-29");

        VacationDay vacationDay = builder.addDay();
        builder.addTicket(vacationDay, "Plane Ticket").addEvent(vacationDay, "Fly to Destination").addEvent(vacationDay, "Supper").addHotel(vacationDay, "Hilton");

        vacationDay = builder.addDay();
        builder.addTicket(vacationDay, "Zoo Ticket").addEvent(vacationDay, "Bus to Zoo").addEvent(vacationDay, "Feed animals").addHotel(vacationDay, "Home Inn");

        vacationDay = builder.addDay();
        builder.addTicket(vacationDay, "Beach");
        builder.addEvent(vacationDay, "Swimming");
        builder.addHotel(vacationDay, "Home inn");

        vacationDay = builder.addDay();
        builder.addTicket(vacationDay, "Plane Ticket").addEvent(vacationDay, "Fly to Home");

        builder.getVacation().showInfo();
    }
}
