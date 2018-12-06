package quiz2;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("GRADE CHECKER");
        System.out.print("Enter grade 1: ");
        a = sc.nextDouble();
        System.out.print("Enter grade 2: ");
        b = sc.nextDouble();

        System.out.println();
        System.out.println("GRADES:");
        System.out.println("--------------------");

        if (a > b) {
            System.out.println("[X] 60.5");
            System.out.println("[ ] 47.2");
        }
        else{
            System.out.println("[ ] 65.2");
            System.out.println("[X] 80.0");
        }

      

        System.out.print("--------------------");
        System.out.println("");

        c = (a + b) / 2;
        System.out.println("Average: ");
        System.out.printf("%4.2f", c);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("");

        if (c < 60) {
            System.out.println("=================");
            System.out.println("WARNING");
            System.out.println("STUDENT FAILED");
            System.out.println("=================");
        }
    }
