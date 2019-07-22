package view;

import java.util.Scanner;

public class TeacherMenu {
    public char getMenu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("***** MENU *****");
        System.out.println("1. Add Teacher");
        System.out.println("2. Remove Teacher");
        System.out.println("3. Display Teachers");
        System.out.println("Enter your choice: ");

        return sc.next().charAt(0);

    }
}
