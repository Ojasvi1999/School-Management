package model;

public class Student {
    String name;
    int standard;

    public Student(){}

    public Student(String name, int standard){
        this.name = name;
        this.standard = standard;
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
}
