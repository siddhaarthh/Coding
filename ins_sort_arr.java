import java.util.Array;
public class ins_sort_arr {
    public static void main(String[] args){
        int arr[]={2,4,3,1};
        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j])
            {
                arr[j-1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
