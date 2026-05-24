package org.myJava.behavior.State.example1;

public class ConcreteStateA implements State {

	@Override
	public void handle(String sampleParameter) {

		System.out.println("ConcreteStateA handle ：" + sampleParameter);
	}

}