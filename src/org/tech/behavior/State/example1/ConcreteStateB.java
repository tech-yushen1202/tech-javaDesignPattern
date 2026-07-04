package org.tech.behavior.State.example1;

public class ConcreteStateB implements State {

	@Override
	public void handle(String sampleParameter) {

		System.out.println("ConcreteStateB handle ：" + sampleParameter);
	}

}