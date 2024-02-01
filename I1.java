class human // super class or base class or parent class
{
    int age;
    void sleep()
    {
        age = 18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class student extends human // sub class or child class or derived class
{

}
public class I1
{
    public static void main(String []args)
    {
        student st = new student();
        st.sleep();
    }
}