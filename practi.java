class bike{
    void run()
    {
        System.out.println("bike is running");
    }
}

class practi extends bike{
        void run()
        {
            System.out.println("practi is running");
        }

     public static void main(String[] args)
     {
        bike p=new practi();
        p.run();
     }   
}