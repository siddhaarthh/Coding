import java.util.*;

class Student {
    String name, Student_designation, learing_platform;
    int Student_ID;
    String[] Subjects_taken = new String[6];
    float cost_per_subject, discount_rate;

Student() {
name = "Siddharth jain";
Student_designation = "Bachelor of technology in Computer Science and Engineering";
Subjects_taken[0] = "Introduction to Java Programming";
Subjects_taken[1] = "Computer oranization and Architecture";
Subjects_taken[2] = "Discrete Mathematics";
Subjects_taken[3] = "Digital Electronics and Applications";
Subjects_taken[4] = "Indian Constitution";
Subjects_taken[5] = "Principles of Management";
learing_platform = "Offline";
Student_ID = 1000016125;
cost_per_subject = 15000;
discount_rate = 9.5f;
}

    void display_name() {
        System.out.println("Superclass \nName : " + name);
    }

    void display_data() {
        System.out.println("Name : " + name);
        System.out.println("Desgnation : " + Student_designation);
        System.out.println("Subject Taken : " + Arrays.toString(Subjects_taken));
        System.out.println("Student ID : " + Student_ID);
        System.out.println("Learning Platform: " + learing_platform);
        System.out.println("Cost per Subject : " + cost_per_subject);
        System.out.println("Discount Rate : " + discount_rate);
    }
}

class online_Student extends Student {
    void dispaly_name() {
        System.out.println("Subclass \n Name : " + super.name);
    }

void call_function() {
System.out.println("This is online Student class that calls the function of Student class");
display_data();
}
}

class part_time_Student extends Student {
void display() {
System.out.println("This is subclass inherited from Student class and all the data are shown through Superclass");
display_data();
}
}

class special_online_Student extends online_Student {
void create() {
System.out.println("This is Special online student class that inherits online student class");
call_function();
}
}

class driver {
    void start() {
        Student s1 = new Student();
        online_Student o1 = new online_Student();
        // Overriding Shown here
        s1.display_name();
        o1.dispaly_name();
        System.out.println("\n");
        // Multilevel inheritance
        special_online_Student s2 = new special_online_Student();
        s2.create();
        System.out.println("\n");
        // Hierarchical Inheritance
        part_time_Student p1 = new part_time_Student();
        p1.display();
    }
}

class Project {
    public static void main(String[] args) {
        driver d1 = new driver();
        System.out.println("Name : Siddharth jain");
        System.out.println("SAP ID : 1000016125");
        System.out.println("\n");
        d1.start();
    }
}
