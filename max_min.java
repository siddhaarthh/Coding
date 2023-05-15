import java.util.Scanner;
public class max_min {
    public static void main(String args[]){
        System.out.println("enter two num for getting its respective properties ");
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("max num is "+ Math.max(a,b));
        System.out.println("min num is " +Math.min(a,b));
        System.out.println("sqrt of a is "+ Math.sqrt(a));
    }
}
