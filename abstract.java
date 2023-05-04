abstract class developer
{
    abstract void developer();
    
}

class Html extends developer
{
   @Override
   void developer()
    {
        System.out.println("web development");
    }
}

class java extends developer
{
    @Override
     void developer()
    {
        System.out.println("java development");
    }
}

public class abstract {
    public static void main(String args[]){
    Html h=new Html();
    h.developer();
    java j=new java();
    j.developer();
}
}