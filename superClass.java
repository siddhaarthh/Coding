class Animal{
    void eat()
    {
        System.out.println("grass");
    }
}

class tiger extends Animal
{
    void eat()
    {
        System.out.println("hii");
    }
    void work()
    {
        super.eat();
    }
    
}
public class superClass {
    public static void main(String[] args)
    {
        tiger t=new tiger();
        t.work();
        t.eat();
        
    }
}
