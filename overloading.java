public class overloading {
    int m1(int x, double d)
    {   double a= x+d;
        System.out.println("m1 ");
        return (int)a;
    }
    void m1(int x, String s)
    {
        System.out.println("m2 "+s);
    }
    void m1(int x)
    {
        System.out.println("m3 "+x);
    }
    void m1(int x, int y)
    {
        System.out.println("m4 "+y);
    }
    public static void main(String args[])
    {
        overloading o = new overloading();
     //  int a= o.m1(10,20,0);
        o.m1(20);
        o.m1(40," s");
        o.m1(20 ,20);
        o.m1(12);
    }



}
