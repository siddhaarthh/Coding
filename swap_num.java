import java.util.Scanner;
public class swap_num {
    public static void main(String args[]){
        System.out.println("enter two num ");
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("swap is"+ a +" \n "+ b);
    }
    
}
