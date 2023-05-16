import java.util.Scanner;
public class positive_negative_num {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0)
        System.out.println("num is negative ");
        else
        System.out.println("num is positive ");
    }
}
