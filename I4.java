// this is the program to show multiple level inheritance
class demo1
{
    void display()
    {
        System.out.println("display written in demo 1 class");
    }
}
class demo2 extends demo1
{
   
}
class demo3 extends demo2
{

}
public class I4
{
    public static void main(String []args)
    {
        System.out.println("display written in main method class");
        demo3 a = new demo3();
        a.display();
    }
}