// this is a example to show the use of abstract and final method
abstract class Parent3
{
    abstract void display();
    final void display2()
    {
        System.out.println("This is a final method");
    }
}
class Child3 extends Parent3
{
    void display()
    {
        System.out.println("This is the output of the abstracted class");
    }
   // void display2() // this gives error
   // {
   //     System.out.println("This would be the output if overriden");
   // }
}
public class I15
{
    public static void main(String args[])
    {
        Child3 c = new Child3();
        c.display();
        c.display2();
    }
}