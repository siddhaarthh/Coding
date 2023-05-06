import java.util.Scanner;
public class armstrong{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int a=simple_calculator.newint();
    System.out.println("Enter the first number");
    int b=s.nextInt();
    System.out.println("Enter the second number");
    int t,r=0,j,k,i;
    for(i=a;i<=b;i++)
    {
        t=i;
        while(t!=0)
        {
            j=t%10;
            k=j*+r*r*r;
            t=t/10;
        }
        if(k==i)
        {
            System.out.println("Armstrom number are: "+k);
        }

    }
}
}
