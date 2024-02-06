class Animal
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
}


class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunts and eats");
    }
}

public class I7
{
    public static void main(String []args)
    {
        Tiger t = new Tiger();
        t.eat();
    }
}