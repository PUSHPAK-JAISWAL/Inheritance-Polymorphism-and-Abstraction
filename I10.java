class AeroPlane2 // this is a parent class
{
    public void takeoff()
    {
        System.out.println("Aeroplane is takeing off ");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane2 extends AeroPlane2 // this is a child class
{
    public void takeoff()
    {
        System.out.println("CargoPlane needs a longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at a lower height");
    }
}
class PassengerPlane2 extends AeroPlane2 // this is a child class
{
    public void takeoff()
    {
        System.out.println("PassengerPlane need medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane needs flies at medium height");
    }
}
class FighterPlane2 extends AeroPlane2// this is a child class
{
    public void takeoff()
    {
        System.out.println("FighterPlane needs a small runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at higher height");
    }
}
class Airport 
{
    public void poly(AeroPlane2 ref)
    {
        System.out.println(" ");
        ref.takeoff();
        ref.fly();       
        System.out.println(" ");
        System.out.println("----------------------------------------");
    }
}
public class I10
{
    public static void main(String args[])
    {
        CargoPlane2 cp = new CargoPlane2();// making object of CargoPlane2
        PassengerPlane2 pp = new PassengerPlane2();// making object of PassengerPlane2
        FighterPlane2 fp = new FighterPlane2();// making object of fighterPlane2

        Airport ap = new Airport();

        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);
    }
}