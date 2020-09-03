package studentdatabaseapp;

import java.util.Scanner;
import java.util.ArrayList;


public class StudentDatabaseApp {

    static private String userChoice = "";

    static private void showStudents(ArrayList<Student> students){  // passing arraylist students into the static method
        for (int i=0;i<students.size();i++){    // loop through the list to show index. loop through arraylist and make a new hashmap could work too
            System.out.println("Current student list and their index numbers: \n" + students.get(i).getFullName() + " - " + "index: " + i + "\n");
        }
    }
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<Student>(); // store Student obects in arraylist

        while(true){
            showStudents(students);
            System.out.println("Y to enroll a new student, S to search for a student info and N to quit.");
            Scanner in = new Scanner(System.in);
            userChoice = in.nextLine();
            if (userChoice.equals("N")){
                break;
            }else if(userChoice.equals("Y")){
                Student stu = new Student();
                stu.enroll();
                stu.payTuition();
                students.add(0,stu);
                System.out.println(students.get(0).showInfo());
            }else if(userChoice.equals("S")){
                System.out.println("Please select the corresponding index numebr: ");
                try{
                    System.out.println("Information of the student: \n--------------------\n" + students.get(in.nextInt()).showInfo() + "\n---------------------");
                }catch(IndexOutOfBoundsException e){
                    System.out.println(e);
                    continue;
                }
            }else{
                continue;
            }
        }

        

        
    

        
    






        // System.out.println("Enter total number of students to be enrolled: ");
        // Scanner in = new Scanner(System.in);
        // int numOfStudents = in.nextInt();
        
        // Student[] students = new Student[numOfStudents];

        // for(int n = 0; n < numOfStudents; n++){
        //     students[n] = new Student();
        //     students[n].enroll();
        //     students[n].payTuition();
        //     System.out.println(students[n].showInfo());
        // }



        // Student stu1 = new Student();
        // stu1.enroll();
        // stu1.payTuition();
        // System.out.println(stu1.showInfo());
    }
    
}
