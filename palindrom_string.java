import java.io.*;
import java.util.*;

public class palindrom_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=A;
        String nstr = "";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0 ; i<=A.length()-1;i++)
        {
           char str= A.charAt(i);           
           nstr = str+nstr;

        }
        System.out.println(nstr);
        if(nstr.equals(B))
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}



