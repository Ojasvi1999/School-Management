import model.Student;
import view.Menu;

import java.util.Scanner;

public class SchoolManagementSystemLauncher {
    public static void main(String[] args) {
        new SchoolManagementSystemLauncher().execute();
    }

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

    Student s[] = new Student[5];

    void addStudent(){
        for(int i=0;i<5;i++){
            s[i] = new Student();
            s[i].setName("Name " + i);
        }


    }

    void display(){
        for(int i=0;i<5;i++){
            System.out.println(s[i].getName());
        }
    }
}
