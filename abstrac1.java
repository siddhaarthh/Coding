abstract class Vehicle
{
     abstract void seats();
    abstract void stearing();
    abstract void engine();
}


class car extends Vehicle{
    @Override
    void seats()
    {
        
    }
    void stearing()
    {
        System.out.println("stearing");
    }
    void engine()
    {
        System.out.println("engine");
    }
}

class truck extends Vehicle{
    @Override
    void seats()
    {
        System.out.println("seats");
    }
    void engine()
    {
        System.out.println("engine");
    }
    void stearing()
    {
        System.out.println("driver");
    }
}
public class abstrac1{
public static void main(String[] args)
{
    car c=new car();
    truck t=new truck();
    t.engine();
    t.seats();
    t.stearing();
    
    
    c.engine();
    c.seats();
    c.stearing();
}
}