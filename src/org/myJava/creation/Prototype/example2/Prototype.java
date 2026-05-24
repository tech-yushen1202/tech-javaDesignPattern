package org.myJava.creation.Prototype.example2;

public interface Prototype {
	public Prototype clone();

	public String getName();

	public void setName(String name);
}