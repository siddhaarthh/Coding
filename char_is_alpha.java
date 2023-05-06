import java.util.Scanner;
public class char_is_alpha {
    public static void main(String args[]){
        System.out.println("enter key");
        Scanner s=new Scanner(System.in);
        char c = s.next().charAt(0);
        System.out.println(c);
        if((c>='a'&&c<='z')|| (c>='A'&&c<='Z'))
        System.out.println("it is alphabet "+c);
        else 
        System.out.println("not alphabet "+c);
    }
}
