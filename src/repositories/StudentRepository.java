package repositories;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository {

    ArrayList<Student> listStudents = new ArrayList<>();

    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int standard;

        System.out.println("ADD Student");
        System.out.println("Enter name: ");
        name = sc.next();

        System.out.println("Enter rollno: ");
        rollNo = sc.nextInt();
        System.out.println("Enter Standard");
        standard = sc.nextInt();

        /* creating a student object */
        Student student = new Student();
        student.setName(name);
        student.setRollNo(rollNo);
        student.setStandard(standard);

        listStudents.add(student);

    }

    public void display() {
        System.out.println("Details of Students are:");
        for (int i = 0; i < listStudents.size(); i++) {
            System.out.println(listStudents.get(i).getName());
            System.out.println(listStudents.get(i).getRollNo());
            System.out.println(listStudents.get(i).getStandard());
        }
    }

    public void removeStudent() {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index no(of student) you wanna remove");
        a = scan.nextInt();
        listStudents.remove(a);
    }
}
