package org.tech.behavior.Visitor.example2;

class Client {
    public static void main(String[] args) {
        Visitor visitor1, visitor2;
        Element elementA, elementB;
        ObjectStructure obj = new ObjectStructure();
        visitor1 = new ConcreteVisitor1();
        visitor2 = new ConcreteVisitor2();
        elementA = new ConcreteElementA();
        elementB = new ConcreteElementB();
        obj.addElement(elementA);
        obj.addElement(elementB);
        obj.accept(visitor1);
        obj.accept(visitor2);
    }
}
