import java.util.Scanner;
public class Take_input {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
        System.out.println(a+2);
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(b + c);
        int d = b + c;
        if(d==a)
        {
            System.out.println("sum is same as a ");
        }
        else
        System.out.println("sum not equal to a");
    }
}
