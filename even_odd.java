import java.util.Scanner;
public class even_odd {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        System.out.println("even num");
        else
        System.out.println("odd num");
    }
}
