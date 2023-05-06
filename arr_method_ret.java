
public class arr_method_ret {
public static int[] arr(){
    int[] a={1,3,4};
    return a;
}
    public static void main(String[] args){
        int b[]=arr();
        for(int i=0;i<b.length;i++){
        System.out.print(" " + b[i]);
        }
    }
}
