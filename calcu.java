import java.util.Scanner;
public class calcu {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num1");
        int a=s.nextInt();
        System.out.println("enter num2");
        int b=s.nextInt();
        System.out.println("enter 1:add 2:subs 3:multiply 4:divide");
        char t=s.next().charAt(0);
        int c;
        switch(t)
        {
            case '1': 
                    System.out.println("addition is " + (a+b));
                    break;
            case '2':  c=a-b;
                    System.out.println("subs is " + c);
                    break;
            case '3':  c=a*b;
                    System.out.println("multiplication is " + c);
                    break;
            case '4':  c=a/b;
                    System.out.println("division is " + c);
                    break;                
        }
    }
}
