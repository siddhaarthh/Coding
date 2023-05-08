import java.util.Scanner;
public class digits_in_num {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int j=0;
        while(a!=0)
        {
            a=a/10;
            j++;
        }
        System.out.println("num of digits is" + j);
    }
}
