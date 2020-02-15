public class method {
    double myMethod(int x , double d)
    {
        double a =x+d;
        System.out.println("method 1 "+a);
        return a;
    }

    void myMethod2(int x,String y)
    {
        System.out.println("method 2 "+y);
    }
    public static void  main(String args[])
    {
        method d = new method();
           d.myMethod(10,20.0);
           d.myMethod2(10," ");
    }
}
