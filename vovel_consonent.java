import java.util.Scanner;
public class vovel_consonent {
    public static void main(String args[]){
        System.out.println("enter alphabet ");
        Scanner s = new Scanner(System.in);
        char wt = s.next().charAt(0);
        if((wt=='a')||(wt=='e')||(wt=='i')||(wt=='o')||(wt=='u'))
        System.out.println("vovel");
        else
        System.out.println("consonent");
    }
}
