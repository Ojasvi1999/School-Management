package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class StudentMenu extends JFrame {

    JButton btnAddstudent;
    JButton btnRemovestudent;
    JButton btnDisplaystudents;
    JButton btnReturn;

    public StudentMenu(){

        setLayout(new FlowLayout());

        btnAddstudent = new JButton("Add Student");
        btnRemovestudent = new JButton("Remove Student");
        btnDisplaystudents = new JButton("Display Students");
        btnReturn = new JButton("Return to main menu");

        btnAddstudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudentForm();
            }
        });

        add(btnAddstudent);
        add(btnRemovestudent);
        add(btnDisplaystudents);
        add(btnReturn);

        setBounds(200, 200, 800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public char getMenu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("***** MENU *****");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Students");
        System.out.println("Enter your choice: ");

        return sc.next().charAt(0);

    }
}
