package org.tech.behavior.Visitor.example2;

//具体元素A
public class ConcreteElementA implements Element{
    public void accept(Visitor visitor){
        visitor.visitA(this);
    }
}