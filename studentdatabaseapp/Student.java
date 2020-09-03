package studentdatabaseapp;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public Student(){   // Studetn class constructor

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        lastName = in.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
        gradeYear = in.nextInt();
        setStudentID();
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);     
    }

    private void setStudentID(){
        id++; // static variable id belongs to the class, which means it belongs to all objects
                //everytime an obejct is created, the id variable increases by 1
        studentID = gradeYear + "" + id;
    }

    public void enroll(){
    
        while (true){
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses +"\n "+ course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{
                //System.out.println("ENTROLLED IN: " + courses);
                return;
            }  
        }
    }

    public void viewBalance(){
        System.out.println("You balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks for the payment of: $" + payment);
        viewBalance();
        return;
    }

    public String showInfo(){
        return "Name:" + firstName + " " + lastName +
                "\nStudent ID: " + studentID +
                "\nGrade Level: " + gradeYear +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }





}
