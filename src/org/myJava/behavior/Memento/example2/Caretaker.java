package org.myJava.behavior.Memento.example2;

public class Caretaker {

	private MementoIF memento;

	/**
	 * 备忘录取值方法
	 */
	public MementoIF retrieveMemento() {
		return memento;
	}

	/**
	 * 备忘录赋值方法
	 */
	public void saveMemento(MementoIF memento) {
		this.memento = memento;
	}
}