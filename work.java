import java.util.Scanner;
public class work
{
	public static void main(String[] args) {
	    String name="siddharth";
		System.out.println(name.length());//length of string
		System.out.println(name);
		System.out.println(name.toUpperCase());//to print lettes in capital
		System.out.println(name.charAt(5));
		int a=12;
		System.out.println(a);
		Scanner s=new Scanner(System.in);//defining new variable for input
		System.out.println("enter age");
		int n=s.nextInt();//declaring type of variable
		System.out.println(n);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		float c=sc.nextFloat();
		System.out.println(c);
		
	}
}
