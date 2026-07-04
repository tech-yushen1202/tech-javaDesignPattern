package org.tech.behavior.Visitor.example2;

import java.util.ArrayList;
import java.util.Iterator;

//对象结构
public class ObjectStructure {
    private ArrayList list = new ArrayList();

    public void accept(Visitor visitor) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }
}