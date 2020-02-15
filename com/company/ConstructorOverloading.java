package com.company;

public class ConstructorOverloading {
    String name;
    int age;
    String address;
    ConstructorOverloading (){}
    public ConstructorOverloading (String name, int age )
    {
        this.name =name;
        this.age=age;

    }
    public ConstructorOverloading (String name, int age ,String addr)
    {
        this(name,age);
        address=addr;
    }
    void display()
    {
        System.out.println("Name:\t"+name+" age : \t"+age+" address\t"+address);
    }

    public static void main(String args[])
    {
        ConstructorOverloading  p1 =new ConstructorOverloading ();
        p1.display();
        ConstructorOverloading  p2 =new ConstructorOverloading ("mell",30);
        p2.display();
        ConstructorOverloading  p =new ConstructorOverloading ("mell",30,"pune");
        p.display();
    }
}
