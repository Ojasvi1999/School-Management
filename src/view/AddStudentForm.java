package view;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class AddStudentForm extends JFrame {

    JLabel lblName;
    JLabel lblStandard;

    JTextField jtfName;
    JTextField jtfStandard;

    JButton btnAddStudent;

    public AddStudentForm(){

        setLayout(new FlowLayout());

        lblName = new JLabel("Name");
        lblStandard = new JLabel("Standard");

        jtfName = new JTextField(30);
        jtfStandard = new JTextField(30);

        btnAddStudent = new JButton("Add Student");

        add(lblName);
        add(jtfName);

        add(lblStandard);
        add(jtfStandard);

        add(btnAddStudent);

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

