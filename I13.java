// this is a example of inheritance
class Parent
{
    public void display()
    {
        System.out.println("This is a part of parent class");
    }
}
class Child extends Parent
{

}
public class I13
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.display();
    }
}