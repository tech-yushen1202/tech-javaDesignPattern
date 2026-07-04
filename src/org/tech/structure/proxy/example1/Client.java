package org.tech.structure.proxy.example1;

public class Client {

	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}

}