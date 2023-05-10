import java.util.Scanner;
public class GCD_two_num {
    public static void main (String args[]){
        System.out.println("enter two num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int i,j=1;
        for(i=1;(i<a)&&(i<b);i++)
        {
            if((a%i==0 )&&(b%i==0))
            j=i;
        }
        System.out.println("gcd is "+ j);
       
   }
}
