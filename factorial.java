import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        System.out.println("enter num");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,fact=1;
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of num is "+ fact);
    }
}
