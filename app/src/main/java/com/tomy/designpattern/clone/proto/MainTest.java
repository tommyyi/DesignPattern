package com.tomy.designpattern.clone.proto;

import com.tomy.designpattern.clone.EventTemplate;

import java.util.Random;


public class MainTest
{
    public static void main(String[] args)
    {
        int i = 0;
        int MAX_COUNT = 10;
        EventTemplate eventTemplate = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");
        Mail mail = new Mail(eventTemplate);

        while (i < MAX_COUNT)
        {
            // 每封邮件的接收者不一样，其它都一样
            Mail cloneMail = mail.clone();
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            // 然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    public static String getRandString(int maxLength)
    {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++)
        {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void sendMail(Mail mail)
    {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t内容：" + mail.getContent() + "\t....发送成功！");
    }
}
