package Basics;
import java.util.Scanner;

public class Qone {
    public static void main(String[] args) {
          try (Scanner s = new Scanner(System.in)) {
            System.out.print("Each paper is out of:");
            float n = s.nextInt();
            System.out.print("Enter you Marks in Maths = ");
            float m = s.nextInt();

              System.out.print("Enter you Marks in English = ");
             float e = s.nextInt();

              System.out.print("Enter you Marks in Hindi = ");
            float h = s.nextInt();

             System.out.print("Enter you Marks in Physics = ");
            float p = s.nextInt();

             System.out.print("Enter you Marks in Chemistry = ");
            float c = s.nextInt();
            float totalMarks= 5*n;

            float percentage = ((m + p + h + e + c)/totalMarks)*100;
            System.out.println("Percentage ="+percentage);
            
        }     
    }
}
