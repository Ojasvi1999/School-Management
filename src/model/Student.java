package model;

public class Student {
    String name;
    int standard;
    int rollNo;



    public Student(){}

    public Student(String name, int standard, int rollNo){
        this.name = name;
        this.standard = standard;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
