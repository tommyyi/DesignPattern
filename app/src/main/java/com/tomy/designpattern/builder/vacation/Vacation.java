package com.tomy.designpattern.builder.vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Vacation
{
    private ArrayList<VacationDay> mVacationDayLst;
    private Date mStartDate;

    public Vacation(String startDay)
    {
        mVacationDayLst = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            mStartDate = sdf.parse(startDay);
            VacationDay vacationDay = new VacationDay(mStartDate);
            mVacationDayLst.add(vacationDay);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }

    public Date getStartDate()
    {
        return mStartDate;
    }

    public void setStartDate(String std)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            mStartDate = sdf.parse(std);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }

    public VacationDay addVacationDay()
    {
        VacationDay vacationDay = new VacationDay(nextDate());
        mVacationDayLst.add(vacationDay);
        return vacationDay;
    }

    public VacationDay getVacationDay(int i)
    {
        if ((i > 0) && (i < mVacationDayLst.size()))
        {
            return mVacationDayLst.get(i);
        }
        return null;
    }

    public void setHotel(VacationDay vacationDay, String mHotels)
    {
        vacationDay.setHotel(mHotels);
    }

    public void addTicket(VacationDay vacationDay, String ticket)
    {
        vacationDay.addTicket(ticket);
    }

    public void addEvent(VacationDay vacationDay, String event)
    {
        vacationDay.addEvent(event);
    }

    public void showInfo()
    {
        for (int i = 0, len = mVacationDayLst.size(); i < len; i++)
        {
            System.out.println("** " + (i + 1) + " day**");
            System.out.println(mVacationDayLst.get(i).showInfo());
        }
    }

    /**
     * @return 假设第一天是5号，假设已经有3天的安排：5、6、7
     * 那么新增的1天，就是5+3=8，就是新增8号的安排
     */
    private Date nextDate()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(mStartDate);
        cal.add(Calendar.DATE, mVacationDayLst.size());
        return cal.getTime();
    }
}
