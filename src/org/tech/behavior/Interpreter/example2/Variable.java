package org.tech.behavior.Interpreter.example2;

public class Variable extends Expression {

	public int interpret(Context con) {
		// this为调用interpret方法的Variable对象
		return con.lookupValue(this);
	}

}
