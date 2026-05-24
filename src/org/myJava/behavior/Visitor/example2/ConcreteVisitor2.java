package org.myJava.behavior.Visitor.example2;

//具体访问者二号
public class ConcreteVisitor2 extends Visitor{
    public void visitA(ConcreteElementA elementA){
        /*二号访问者对A元素的具体操作*/
    }
    
    public void visitB(ConcreteElementB elementB){
        /*二号访问者对B元素的具体操作*/
    }
}