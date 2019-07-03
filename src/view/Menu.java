package view;

import java.util.Scanner;

public class Menu {
    public char getMenu(){
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("***** MENU *****");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Students");
        System.out.println("Enter your choice: ");
        ch = sc.next().charAt(0);

        return ch;
    }
}
