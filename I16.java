import java.util.Scanner;
final class Parent4
{
    void display(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
    }
}
public class I16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Parent4 p = new Parent4();
        p.display(a, b);
    }
}