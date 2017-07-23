package com.tomy.designpattern.memento;

import java.util.HashMap;

public class MementoCaretaker
{
    private HashMap<String, IMementoIF> mementoMap;

    public MementoCaretaker()
    {
        mementoMap = new HashMap<>();
    }

    /**
     * @param name 获取备忘录
     * @return
     */
    public IMementoIF retrieveMemento(String name)
    {
        return mementoMap.get(name);
    }

    /**
     * 保存备忘录
     */
    public void saveMemento(String name, IMementoIF memento)
    {
        this.mementoMap.put(name, memento);
    }
}
