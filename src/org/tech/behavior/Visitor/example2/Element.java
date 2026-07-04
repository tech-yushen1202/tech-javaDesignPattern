package org.tech.behavior.Visitor.example2;

//抽象元素
public interface Element{
    public void accept(Visitor visitor);//访问者访问元素的接口
}
