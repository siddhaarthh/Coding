class employee{
    void name()
    {
        System.out.println("siddharth");
    }
    void age()
    {
        System.out.println("19");
    }
}
public class polymorphism {
    public static void main(String[] agrs)
    {
        employee e=new employee();
        System.out.println("Name of employee is: ");
        e.name();
        System.out.println("age is: ");
        e.age();
    }
}
