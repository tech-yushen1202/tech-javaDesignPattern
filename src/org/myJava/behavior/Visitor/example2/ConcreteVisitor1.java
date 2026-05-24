package org.myJava.behavior.Visitor.example2;

//具体访问者一号
public class ConcreteVisitor1 extends Visitor{
    public void visitA(ConcreteElementA elementA) {
        /*一号访问者对A元素的具体操作*/
    }
    
    public void visitB(ConcreteElementB elementB){
        /*一号访问者对B元素的具体操作*/
    }
}