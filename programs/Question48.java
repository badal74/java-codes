public class Question48 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student(23101, "John");
        System.out.println("Student created using default constructor: ");
        stud1.getInfo();
        System.out.println();
        System.out.println("Student created using overloaded constructor: ");
        stud2.getInfo();
    }
}

class Student{
    private String name;
    private int rollNo;

    Student(){  // default constructor
        this.rollNo = 0;
        this.name = "Null";
    }

    Student(int rollNo, String name){   // parameterized overloaded constructor
        this.rollNo = rollNo;
        this.name = name;
    }

    void getInfo(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }
}