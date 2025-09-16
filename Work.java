import java.util.Scanner;
public class Work {
    int  employeeCode;
    String employeeName;
    int  date_Of_Joining;
    int  current_date;
    Scanner sc=new Scanner(System.in);
    public void get(){
        System.out.println("Enter Employee Code= ");
        employeeCode=sc.nextInt();
        System.out.println("Enter Employee Name= ");
        employeeName=sc.next();
        System.out.println("\nEnter year Of Joining= ");
        date_Of_Joining=sc.nextInt();
    }
    public void getCurrentDate() {
        System.out.println("Enter Current Year= ");
        current_date = sc.nextInt();

        if (current_date - date_Of_Joining > 3) {
            System.out.println("Employee tenure is more than three years");
        } else {
            System.out.println("Employee tenure is not more than three years");
        }
    }
    public static void main(String[] args) {
        Work e1=new Work();
        e1.get();

        e1.getCurrentDate();
    }}