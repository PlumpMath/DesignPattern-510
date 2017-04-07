package com.latewind.pattern.behavioral.memono;

import java.util.LinkedList;
import java.util.List;

import com.latewind.pattern.behavioral.memono.Role.Memento;

public class CareTaker {
	private List<Memento> mementos = new LinkedList<>();
	private Integer size = 0;

	public void setMemento(Memento memento) {
		mementos.add(memento);
		size++;
	}

	public Memento getMemento(Integer index) {
		if (index < size && index > -1) {
			return mementos.get(index);
		}
		return null;
	}

}
