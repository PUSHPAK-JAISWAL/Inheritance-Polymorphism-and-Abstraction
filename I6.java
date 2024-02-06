
class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }
}


class CargoPlane extends AeroPlane
{
    public void fly()// this is called overwriting method
    {
        System.out.println("cargoplane flies at lower height");
    }
    public void CarryGoods() // specialized method
    {
        System.out.println("CargoPlane carriers goods");
    }
}


class PassengerPlane extends AeroPlane
{
    public void fly()// this is overwriting of method
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void CarryPassengers()// specialized method
    {
        System.out.println("PassengerPlane carries passenger");
    }
}


class I6
{
    public static void main(String []args)
    {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.CarryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.CarryPassengers();
    }
}