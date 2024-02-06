// this is a program to check the how to make constructor in the inheritace
class Demo1
{
    int a,b;
    public Demo1()
    {
        System.out.println("parent class constructor");
    }
    public Demo1(int i,int j)
    {
        System.out.println("parameterized parent class constructor");
        a = i;
        b = j;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        super();
        System.out.println("child class constructor");
    }
    public Demo2(int x, int y)
    {
        super(x,y);
        System.out.println("parameterized child class constructor");
        m = x;
        n = y;
    }
}
public class I8 
{
    public  static void main(String []args)
    {
        Demo2 d = new Demo2();
        Demo2 d2 = new Demo2(10,20);
    }
}
