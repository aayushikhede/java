package com.company;

import java.security.PublicKey;

public class ChildClass extends ParentClass{
    public  ChildClass()
    {
        super();
    }
    public ChildClass(String name, int age, String addr) {
        super(name, age, addr);
    }

    public static  void main(String args[])
 {
     ChildClass c = new ChildClass();
     c.display();

     ChildClass c2 = new ChildClass("ram",40,"indore");
     c2.display();

 }
}
