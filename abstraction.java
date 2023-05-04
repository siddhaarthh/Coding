abstract class developer
{
    public abstract void dev();
    public abstract void name();
}

class Html extends developer
{
    @Override
   public void dev()
    {
        System.out.println("web development");
    }
    public void name()
    {
        System.out.println("siddharth");
    }
}

class java extends developer
{
    @Override
    public void dev()
    {
        System.out.println("java development");
    }
    public void name()
    {
        System.out.println("rajan");
    }
}

public class abstraction {
    public static void main(String[] args){
    Html h=new Html();
    h.dev();
    h.name();
    java j=new java();
    j.dev();
    j.name();
    
    }
}
