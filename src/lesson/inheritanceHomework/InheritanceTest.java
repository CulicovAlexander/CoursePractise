package lesson.inheritanceHomework;

public class InheritanceTest {
    public static void main(String[] args) {

        Person person = new Person("Name", "Address");
        Staff staffWorker = new Staff("Alex", "Chicago", "St. Claudia", 1400.5);
        System.out.println("Staff is - " + staffWorker);

        Student student = new Student("Gregory", "Newark", "banchelor", 1996, 1456.6);
        System.out.println("Student is - " + student);

    }
}

