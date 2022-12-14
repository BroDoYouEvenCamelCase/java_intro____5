package singleton;

public class Student {

    public static Student student;


    private Student() {
    }
    // make your constructor private when using singleton
    // prevents the objects from being used in other classes

    // create an instance variable as same class data type
    // provide a getter method to get single object

    public static Student getStudent() {
        if (student == null) student = new Student();
        return student;
    }

    public static void main(String[] args) {


    Student s1 = getStudent();
    Student s2 = getStudent();
    Student s3 = getStudent();
    Student s4 = getStudent();

        System.out.println(s1); // singleton.Student@1540e19d

        System.out.println(s2);// singleton.Student@677327b6

        System.out.println(s3); // singleton.Student@14ae5a5

        System.out.println(s4); // singleton.Student@7f31245a

}
}
