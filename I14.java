// this is an example to show abstraction
abstract class Parent1 
{
    abstract public void display();
}
class Child2 extends Parent1
{
   public void display()
    {
        System.out.println("Hello World");
    }
}
public class I14
{
    public static void main(String args[])
    {
        Child2 c = new Child2();
        c.display();
    }
}