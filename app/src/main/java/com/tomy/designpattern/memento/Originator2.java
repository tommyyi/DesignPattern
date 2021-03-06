package com.tomy.designpattern.memento;

import java.util.ArrayList;

public class Originator2 {
	private ArrayList<String> state;

	public Originator2() {
		state = new ArrayList<String>();
	}

	public IMementoIF createMemento() {
		return new Memento(state);
	}

	public void restoreMemento(IMementoIF memento) {
		state = ((Memento) memento).getState();
	}

	public void testState1() {
		state = new ArrayList<String>();
		state.add("blood:320");
		state.add("progress:gate2 mid");
		state.add("enemy:15");

	}

	public void testState2() {
		state = new ArrayList<String>();
		state.add("blood:230");
		state.add("progress:gate8 last");
		state.add("enemy:12");

	}

	public void showState() {
		System.out.println("now state:" + state.toString());
	}

	private class Memento implements IMementoIF
    {

		private ArrayList<String> state;

		private Memento(ArrayList<String> state) {
			this.state = new ArrayList(state);
		}

		private ArrayList<String> getState() {
			return state;
		}

		private void setState(ArrayList<String> state) {
			this.state = state;
		}
	}

}
