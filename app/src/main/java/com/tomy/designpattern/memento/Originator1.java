package com.tomy.designpattern.memento;

import java.util.HashMap;

public class Originator1
{
	private HashMap<String, String> state;

	public Originator1() {
		state = new HashMap();

	}

	public IMementoIF createMemento() {
		return new Memento(state);
	}

	public void restoreMemento(IMementoIF memento) {
		state = ((Memento) memento).getState();
	}

	public void showState() {
		System.out.println("now state:" + state.toString());
	}

	public void testState1() {
		state.put("blood", "500");
		state.put("progress", "gate1 end");
		state.put("enemy", "5");

	}

	public void testState2() {
		state.put("blood", "450");
		state.put("progress", "gate3 start");
		state.put("enemy", "3");

	}

	private class Memento implements IMementoIF
    {

		private HashMap<String, String> state;

		private Memento(HashMap state) {
			this.state = new HashMap(state);
		}

		private HashMap getState() {
			return state;
		}

		private void setState(HashMap state) {
			this.state = state;
		}
	}
}
