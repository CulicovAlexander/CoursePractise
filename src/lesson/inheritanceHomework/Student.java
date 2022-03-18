package lesson.inheritanceHomework;

public class Student extends Person{

    private String program;
    private int year;
    private double fee;


    public Student(String name, String address, String program, int year, double fee){
        super (name,address);
        this.setProgram(program);
        this.setYear(year);
        this.setFee(fee);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name= " + getName() + '\n' +
                " address= " + getAddress() + '\n' +
                " program= " + getProgram() + '\n' +
                " year= " + getYear() + '\n' +
                " fee= " + getFee() + '\n' +
                '}';
    }
}
