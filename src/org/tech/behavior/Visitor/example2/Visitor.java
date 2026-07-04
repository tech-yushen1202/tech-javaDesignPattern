package org.tech.behavior.Visitor.example2;

import java.util.ArrayList;
import java.util.Iterator;

//抽象访问者
public abstract class Visitor {
    public abstract void visitA(ConcreteElementA elementA);

    public abstract void visitB(ConcreteElementB elementB);
}




