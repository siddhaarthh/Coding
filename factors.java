import java.util.Scanner;
public class factors {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int a=s.nextInt();
        int i;
        for(i=1;i<a;i++)
        {
        if(a%i==0)
        System.out.println(i);
        }
    }
}
