package org.myJava.behavior.Visitor.example2;

//具体元素B
public class ConcreteElementB implements Element{
    public void accept(Visitor visitor){
        visitor.visitB(this);
    }
}