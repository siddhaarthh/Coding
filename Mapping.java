import java.lang.*;

class Book implements Runnable{
    @Override
   public void run(){
        System.out.println("hello");
    }
}

public class Mapping extends Thread{
    public static void main(String[] args){
        ExecutorService service =Executors.newFixedThreadPool(3);
        for(int i=0;i<=5;i++){
        Thread obj1=new Thread(new Book(), "sidd");
        obj1.start();
    }
    System.out.println(obj1.getName());
}
}