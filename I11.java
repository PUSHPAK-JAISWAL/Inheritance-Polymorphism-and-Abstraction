abstract class AeroPlane3// this is abstract parent class
{
    abstract public void takeoff();

    abstract public void fly();

    public void landing()
    {
        System.out.println("AeroPlane is landing");
    }
}
class CargoPlane3 extends AeroPlane3// this is child class
{
    public void takeoff()
    {
        System.out.println("CargoPlane needs longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void alert()
    {
        System.out.println("Alert....");
    }
}
class PassengerPlane3 extends AeroPlane3// this is child class
{
    public void takeoff()
    {
        System.out.println("PassengerPlane needs medium runway");
    }
    public  void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane3 extends AeroPlane3 // this is child class
{
    public void takeoff()
    {
        System.out.println("FighterPlane needs smaller runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at higher height");
    }
}
class Airport3 // this is class to execute polymorphism
{
    public void poly(AeroPlane3 ref)
    {
        System.out.println("");
        ref.takeoff();
        ref.fly();
        ref.landing();
        System.out.println("");
        System.out.println("------------------------------------------------");
    }
}
public class I11 // this is main method class
{
    public static void main(String args[])
    {
        AeroPlane3 ref1 = new CargoPlane3();// object creation
        AeroPlane3 ref2 = new PassengerPlane3();// object creation
        AeroPlane3 ref3 = new FighterPlane3();// object creation
        Airport3 ref = new Airport3();// object creation
        System.out.println("");
        ((CargoPlane3) ref1).alert();// this is downcasting
        // it is used to access the specialized method if the object is created with parent classname
        ref.poly(ref1);
        ref.poly(ref2);
        ref.poly(ref3);
    }
}