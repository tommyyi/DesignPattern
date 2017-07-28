package com.tomy.designpattern.clone.proto;

import com.tomy.designpattern.clone.EventTemplate;

import java.util.ArrayList;


public class Mail implements Cloneable
{
    private String receiver;
    private String content;
    private String subject;
    private String tail;
    private ArrayList<String> mArrayList;

    public Mail(EventTemplate et)
    {
        this.tail = et.geteventContent();
        this.subject = et.geteventSubject();
    }

    @Override
    public Mail clone()
    {
        Mail mail = null;
        try
        {
            mail = (Mail) super.clone();
            mail.mArrayList = (ArrayList<String>) this.mArrayList.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getTail()
    {
        return tail;
    }

    public void setTail(String tail)
    {
        this.tail = tail;
    }

}
