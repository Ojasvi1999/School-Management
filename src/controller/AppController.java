package controller;

import model.Student;
import view.Menu;

import java.util.Scanner;

public class AppController {

    Student s[] = new Student[5];
    int c = 0;

    public void execute(){
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        char ch;
        char ch_mm;

        do{

            ch = menu.getMenu();

            switch(ch){
                case '1' :
                    addStudent();
                    break;

                case '2' : System.out.println("Remove Student");
                    break;

                case '3' :
                    display();
                    break;

                default:System.out.println("Wrong Choice");
                    break;
            }


            System.out.println("Return to main menu (y/Y): ");
            ch_mm = sc.next().charAt(0);

        }while(ch_mm == 'y' || ch_mm == 'Y');
    }


    void addStudent(){
        if(c <=4) {
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

            s[c] = new Student(name,standard , rollNo);
            c++;
        }else{
            System.out.println("Array is full");
        }
    }

    void display(){
        for(int i=0;i<c;i++){
            System.out.println(s[i].getName());
            System.out.println(s[i].getRollNo());
            System.out.println(s[i].getStandard());
        }
    }
}
