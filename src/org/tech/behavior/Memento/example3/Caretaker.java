package org.tech.behavior.Memento.example3;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private static List<MementoIF> mementoList = new ArrayList<MementoIF>();

	/**
	 * 获取所有备忘录
	 */
	public List<MementoIF> retrieveAllMemento() {
		return mementoList;
	}

	/**
	 * 获取指定的备忘录
	 */
	public MementoIF getSpecifiedMemoto(int index) {
		return mementoList.get(index);
	}

	/**
	 * 备忘录赋值方法
	 */
	public void saveMemento(MementoIF memento) {
		this.mementoList.add(memento);
	}
}