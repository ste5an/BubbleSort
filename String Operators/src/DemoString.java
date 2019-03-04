

public class DemoString {

    public static void main(String[] args){

        Student s1 = new Student(11,"Navin");
        System.out.println(s1.toString());

    }
}

class Student{

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
