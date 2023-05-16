import java.util.Scanner;
public class pow_of_num {
    public static void main(String args[]){
        System.out.println("enter num ");
        System.out.println("enter power ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double c = Math.pow(a,b);
        System.out.println("result is " + c);
        //or
        double d=1;
        while(b!=0)
        {
            d=a*d;
            b--;
        }
        System.out.println("result is " + d);
    }
}
