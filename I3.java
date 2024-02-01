// this is to show single level inheritance
class animal
{
    void sleep()
    {
        System.out.println("animal needs sleep");
    }
}
class tiger extends animal
{

}

public class I3
{
    public static void main(String []args)
    {
        tiger a = new tiger();
        a.sleep();
    }
}