import java.util.Scanner;

interface rajan {
    void input();
    void output();
}

class interference implements rajan {
    int sapid;
    String pass;

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter password: ");
        pass = s.nextLine();
        System.out.println("enter sap id: ");
        sapid = s.nextInt(); 
    }

    public void output() {
        System.out.println(sapid + " " + pass);
    }

    public static void main(String[] args) {
        rajan r = new interference();
        r.input();
        r.output();
    }
}
