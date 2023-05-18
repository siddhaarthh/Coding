import java.util.Scanner;
public class qutioent_reminder {
    public static void main(String args[]){
        System.out.println("enter divident and divisor ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("qutient is "+ a/b);
        System.out.println("reminder is"+ a%b);
    }
}
