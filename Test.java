import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        System.out.println("enter total numbers :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        int i;
        System.out.println("enter the array :");
        for(i=0;i<=n;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("enter the number you want to search :");
        int f=s.nextInt();
        for(i=0;i<n;i++)
        {
            int flag=0;
            if(ar[i]==f)
            {
                flag++;
                break;
            }
            else
                flag=0;
        }
        if(flag>=1)
        System.out.println("element found ");
        else
        System.out.println("element not found ");
    }
}