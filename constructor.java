import java.util.*;
/*public class constructor {
    int modelYear;
    String modelName;
  
    public constructor(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      constructor myCar = new constructor(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }*/
  public class constructor{
   static int x;
   static int y;
    int a;
     constructor()
    {
        System.out.println(a);
    }
    
    void display()
    {
        System.out.println(a);
    }
     void text(int a,int b)
    {
      x=a;
      y=b;
      System.out.println(x + " " + y);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        constructor s=new constructor();
        System.out.println("enter no. ");
        int n=sc.nextInt();
        int g=sc.nextInt();
        s.text(n,g);
        s.display();
        System.out.println("enter " + g);
    }
  }