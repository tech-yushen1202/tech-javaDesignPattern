package org.myJava.behavior.Memento.example3;

public class Originator {

	private String state1;
	private String state2;

	Originator(String state1, String state2) {
		this.state1 = state1;
		this.state2 = state2;
	}

	public void setState(String state1, String state2) {
		this.state1 = state1;
		this.state2 = state2;
	}

	public String toString() {

		return "state1: " + state1 + "state2: " + state2;

	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(state1, state2);
	}

	/**
	 * 发起人恢复到备忘录对象记录的状态
	 */
	public void restoreMemento(MementoIF memento) {
		this.state1 = ((Memento) memento).getState1();
		this.state2 = ((Memento) memento).getState2();
	}

	private class Memento implements MementoIF {

		private String state1;
		private String state2;

		/**
		 * 构造方法
		 */
		private Memento(String state1, String state2) {
			this.state1 = state1;
			this.state2 = state2;
		}

		public String getState1() {
			return state1;
		}

		public void setState1(String state1) {
			this.state1 = state1;
		}

		public String getState2() {
			return state2;
		}

		public void setState2(String state2) {
			this.state2 = state2;
		}

	}
}