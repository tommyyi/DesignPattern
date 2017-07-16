package com.tomy.designpattern.memento;

import java.util.HashMap;

public class MementoCaretaker {
	private HashMap<String, IMementoIF> mementomap;

	public MementoCaretaker() {
		mementomap = new HashMap<String, IMementoIF>();
	}

	public IMementoIF retrieveMemento(String name) {
		return mementomap.get(name);
	}

	/**
	 * 备忘录赋值方法
	 */
	public void saveMemento(String name, IMementoIF memento) {
		this.mementomap.put(name, memento);
	}
}
