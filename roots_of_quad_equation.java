import java.util.Scanner;
public class roots_of_quad_equation {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter coffitient of x^2");
        float a=s.nextFloat();
        System.out.println("enetr cofficient of x ");
        float b=s.nextFloat();
        System.out.println("enter constant term ");
        float c=s.nextFloat();
        float d = (b*b)-4*a*c;
        double e = Math.sqrt(d);
        double n = 2*a;
        double f = (-b + e)/n;
        System.out.println(f);
        double g = (-b - e)/n;
        System.out.println(g);
    }
}
