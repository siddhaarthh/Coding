import java.util.Scanner;
public class check_pallindrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num ");
        int a=s.nextInt();
        int i,j=0,k=a;
        while(a!=0)
        {
            i=a%10;
            j=j*10+i;
            a=a/10;
        }
        System.out.println("rev is " + j);
        if(j==k)
            System.out.println("entered num is pallindorme ");
        else
        System.out.println("entered num is not pallindorme ");
    }
}
