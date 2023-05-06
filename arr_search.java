import java.nio.file.attribute.FileStoreAttributeView;
import java.util.Scanner;
public class arr_search {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        int count=0;
        System.out.println("enter elements in array ");
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("elements in array ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter element to search ");
        int a=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                count++;
            }
        }
        if(count>0)
            System.out.println("Element Found ");
            else
            System.out.println("Element Not Found");
    }
}
