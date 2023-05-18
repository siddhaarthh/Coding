import java.util.Scanner;
public class recursion {
    static int recursion1(int n){
        if(n==1)
        return 1;

        else
        return (n*recursion1(n-1));
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num: ");
        int n=s.nextInt();
        System.out.println("factorial is: " + recursion1(n));

    }
}
