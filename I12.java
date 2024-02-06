class Animal1
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1
{

}

public class I12
{
    public static void main(String args[])
    {
        Tiger1 t = new Tiger1();
        t.sleep();
    }
}