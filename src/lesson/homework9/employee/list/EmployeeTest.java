package lesson.homework9.employee.list;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] stuffList = new Employee[3];
        stuffList[0] = new Employee( "Robert", 1994, "64C- WallStreet\n");
        stuffList[1] = new Employee( "Joseph", 2000, "68D- WallStreet\n");
        stuffList[2] = new Employee( "John", 1999, "26B- WallStreet\n");

        System.out.println("Name \t Year of joining \t Address\n");

        for (Employee employee : stuffList) {
            employee.printInfo();
        }
    }
}
