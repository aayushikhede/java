package com.company;

public class ParentClass {
    String name;
    int age;
    String address;
   private String color;
   public ParentClass(){}
    public ParentClass (String name, int age ,String addr )
    {
        this.name =name;
        this.age=age;
        address=addr;

    }
    void display()
    {
        System.out.println("Name:\t"+name+" age : \t"+age+" address\t"+address);
    }
}
