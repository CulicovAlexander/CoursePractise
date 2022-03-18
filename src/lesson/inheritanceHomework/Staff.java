package lesson.inheritanceHomework;

public class Staff extends Person {

    public Staff(String name, String address, String school, double pay) {
        super (name,address);
        this.setSchool(school);
        this.setPay(pay);
    }
        private String school;
        private double pay;

        public String getSchool () {
            return school;
        }

        public void setSchool (String school){
            this.school = school;
        }

        public double getPay () {
            return pay;
        }

        public void setPay ( double pay){
            this.pay = pay;
        }

    @Override
    public String toString() {
        return "Staff{" + " Name=" + getName() + '\n' +
                " address= " + getAddress() + '\n' +
                " school=" + getSchool() + '\n' +
                " pay=" + getPay() +
                '}';
    }

}
