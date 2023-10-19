package Basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter first Number:");
            int a = s.nextInt();
             System.out.print("Enter Second Number:");
            int b = s.nextInt(); 
             //for float number--> s.nextFloat()
            int sum = a+b;
            System.out.println("Sum of the numbers is:"+sum);

            //for confirming whether the number is integer or not
            boolean b2= s.hasNextInt();
            System.out.println("Enter the number for checking its type");
            System.out.println(b2); 

            String str = s.nextLine();
            System.out.println(str);
            s.close(); 
    }
}
