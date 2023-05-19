class bike{
    void run()
    {
        System.out.println("bike is running");
    }
}

class RT_poly extends bike{
        void run()
        {
            System.out.println("practi is running");
        }

     public static void main(String[] args)
     {
        bike p=new RT_poly();
        p.run();
     }   
}