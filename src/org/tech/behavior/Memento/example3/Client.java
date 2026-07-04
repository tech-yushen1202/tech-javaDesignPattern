package org.tech.behavior.Memento.example3;

/**
 * 可以保存多个备忘录的实例
 */
public class Client {

	public static void main(String[] args) {

		Caretaker c = new Caretaker();
		Originator o = new Originator("11", "21");
		System.out.println(o);
		MementoIF memo1 = o.createMemento();
		c.saveMemento(memo1);
		o.setState("12", "22");
		System.out.println(o);
		MementoIF memo2 = o.createMemento();
		c.saveMemento(memo2);
		o.restoreMemento(c.getSpecifiedMemoto(0));
		System.out.println(o);
	}

}