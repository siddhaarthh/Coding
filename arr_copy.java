import java.nio.file.attribute.FileStoreAttributeView;
import java.util.Scanner;
public class arr_copy {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[]={1,2,3};
        int b[]=new int[arr.length];
        b=arr;
        
        System.out.println("elements in a are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
    }
}
