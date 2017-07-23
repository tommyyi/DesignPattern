package com.tomy.designpattern.memento;

public class MainTest
{
    public static void main(String[] args)
    {
        MementoCaretaker mMementoCaretaker = new MementoCaretaker();
        Originator1 originator1 = new Originator1();
        Originator2 originator2 = new Originator2();

        System.out.println("*****Originator1*****");
        originator1.testState1();
        mMementoCaretaker.saveMemento("Originator1", originator1.createMemento());
        originator1.showState();
        originator1.testState2();
        originator1.showState();
        originator1.restoreMemento(mMementoCaretaker.retrieveMemento("Originator1"));
        originator1.showState();

        System.out.println("*****Originator1 2*****");
        originator2.testState1();
        originator2.showState();
        mMementoCaretaker.saveMemento("Originator2", originator2.createMemento());
        originator2.testState2();
        originator2.showState();
        originator2.restoreMemento(mMementoCaretaker.retrieveMemento("Originator2"));
        originator2.showState();

        //System.out.println("*****Originator1&&Originator1 2*****");
        //	 originator1.restoreMemento(mMementoCaretaker
        //	 .retrieveMemento("Originator2"));
        //	 originator1.showState();
    }
}
