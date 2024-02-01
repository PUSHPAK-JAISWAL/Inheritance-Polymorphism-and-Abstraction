class human1
{
    private String name;// private members are not inheriated
    int age;
    human1()
    {
        System.out.println("human class constructor");
    }
    void sleep()
    {
        age = 18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class student1 extends human1
{
    void display()
    {
        System.out.println("the age is "+age);
       // System.out.println("the name is "+name);
    }

}
public class I2
{
    public static void main(String []args)
    {
        student1 st1 = new student1();
        st1.sleep();
        st1.display();
    }
}