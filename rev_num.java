import java.util.Scanner;
public class rev_num {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int j,i=0;
       while(a!=0)
       {
            j=a%10;
            i=i*10+j;
            a=a/10;
       }
       System.out.println("rev of num " + i);
       
    }
}
