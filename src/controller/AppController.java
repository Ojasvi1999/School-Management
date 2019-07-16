package controller;

import model.Student;
import repositories.StudentRepository;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    ArrayList<Student> listStudents = new ArrayList<>();

    int c = 0;

    public void execute() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();

        char cha;
        char ch_mm;


        do {

            cha = menu.getMenu();

            switch (cha) {
                case '1':
                    studentRepository.addStudent();
                    break;

                case '2':
                    studentRepository.removeStudent();

                    break;

                case '3':
                    studentRepository.display();
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }


            System.out.println("Return to main menu (y/Y): ");
            ch_mm = sc.next().charAt(0);

        } while (ch_mm == 'y' || ch_mm == 'Y');
    }

}
