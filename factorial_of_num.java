import java.util.Scanner;
class factorial_of_num {
    public static void main(String args[]){
        System.out.println("enter num:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,fact=1;
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is:" + fact);
    }
}
