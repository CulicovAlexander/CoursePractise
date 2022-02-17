package lesson.ninth.homework.employee.list;

public class Employee {
    public int yearOfJoining;
    public String name;
    public String address;

    public Employee (String name, int yearOfJoining, String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void printInfo() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
    }

}
