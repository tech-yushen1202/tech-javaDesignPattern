package org.myJava.structure.adapter.example1;

public interface Target {

	/**
	 * 这是源类Adaptee也有的方法
	 */
	public void sampleOperation1();

	/**
	 * 这是源类Adapteee没有的方法
	 */
	public void sampleOperation2();
}