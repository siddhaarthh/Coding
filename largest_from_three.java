import java.util.Scanner;
public class largest_from_three {
    public static void main(String args[]){
        System.out.println("enter three num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.println("a is greatest ");
            else
            System.out.println("c is gretest ");
        }
        if(b>a)
        {
            if(b>c)
            System.out.println("b is greatest ");
            else
            System.out.println("c is greatest ");
        }

    }
}
