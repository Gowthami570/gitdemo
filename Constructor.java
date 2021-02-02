import Student.Student;


public class Constructor {
    String name;
    int rollno;

    void Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
             {
            Student s1 = new Student(102, "goethu");
            Student s2 = new Student(111, "cheth");
             }
    }
}

