public class myMethod2 {
    int method (int x ,double d)
    {
        double a=x+d;
        return(int)a;
    }
    void method2(int x ,String y )
    {
        System.out.println("method2 "+y);
    }
    public static void main (String args[])
    {
        myMethod2 m = new myMethod2();
        m.method(10,40);
        m.method2(5," aam");
    }
}
