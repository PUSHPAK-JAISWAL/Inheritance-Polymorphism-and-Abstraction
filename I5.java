// this is a program to show hieracial inheritence
class animal
{
    void display()
    {
        System.out.println("animal needs sleep");
    }
}
class tiger extends animal
{

}
class monkey extends animal
{

}
class deer extends animal
{

}
public class I5
{
    public static void main(String args[])
    {
        tiger a = new tiger();
        monkey b = new monkey();
        deer c = new deer();
        a.display();
        b.display();
        c.display();
    }
}