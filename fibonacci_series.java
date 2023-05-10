import java.util.Scanner;
public class fibonacci_series {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,j=0;
        for(i=0;i<=a;i++)
        {
            j=i+j;
            System.out.println(" "+ j);
        }
    }
}
