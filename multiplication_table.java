import java.util.Scanner;
public class multiplication_table {
    public static void main(String args[]){
        System.out.println("enter num to find its multiplication table ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,w;
        for(i=1;i<=10;i++)
        {
            w=i*a;
            System.out.println(w + "\n");
        }
    }
}
