import java.util.Scanner;

public class leap_year {
    public static void main(String args[]) {
        System.out.println("enter year ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a % 4 == 0) {
            if (a % 400 == 0) {
                if (a % 100 != 0) {
                    System.out.println("its a leap year ");
                }
            }
        }
         else
        System.out.println("its not a leap year ");
    }
}
