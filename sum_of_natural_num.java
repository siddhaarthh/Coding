import java.util.Scanner;
public class sum_of_natural_num {
    public static void main(String args[]){
        System.out.println("enter num upto which u want to find sum ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,sum=0;
        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is "+ sum);
    }
}
