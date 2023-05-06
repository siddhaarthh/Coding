import java.util.Scanner;
public class check_prime {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num ");
        int a=s.nextInt();
        int count=0,i;
        for(i=2;i<=a/2;i++)
        {
            if(a%i==0)
            count++;
        }
        if(count!=0)
        System.out.println("not prime num ");
        else
        System.out.println("prime num ");
    }
}
