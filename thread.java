import java.lang.Thread;
public class thread extends Thread{
    public void run()
    {
        System.out.println("hii");
    }
    public static void main(String args[])
    {
        thread t=new thread();
        t.start();
    }
}
