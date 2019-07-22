package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainMenu extends JFrame {

    JButton btnStudent;
    JButton btnTeacher;
    JButton btnExit;

    public MainMenu(){

        setLayout(new FlowLayout());

        btnStudent = new JButton("Student");
        btnTeacher = new JButton("Teacher");
        btnExit = new JButton("Exit");

        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentMenu();
            }
        });

        btnTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TeacherMenu();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(btnStudent);
        add(btnTeacher);
        add(btnExit);

        setBounds(200, 200, 800, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public char getMenu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("***** MENU *****");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.println("Enter your choice: ");

        return sc.next().charAt(0);

    }
}
