import java.util.Scanner;
public class check_alphabet {
    public static void main(String args[]){
        System.out.println("enter alphabet ");
        Scanner s=new Scanner(System.in);
        char aw=s.next().charAt(0);
        if((aw>='a')&&(aw<='z')||(aw>='A')&&(aw<='Z'))
        System.out.println("it is alphabet ");
        else
        System.out.println("it is not alphabet ");
    } 
}
