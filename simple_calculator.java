import java.util.Scanner;
public class simple_calculator{
    public static void amin(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num1");
        int a=s.nextInt();
        System.out.println("enter num2");
        int b=s.nextInt();
        System.out.println("enter 1:add 2:subs 3:multiply 4:divide");
        char t=s.next().charAt(0);
        switch(t)
        {
            case 1: int c=a+b;
                    System.out.println("addition is " + c);
            case 2: int d=a-b;
                    System.out.println("addition is " + c);
            case 3: int e=a*b;
                    System.out.println("multiplication is " + c);
            case 4: int f=a/b;
                    System.out.println("addition is " + c);                
        }
    }
}
