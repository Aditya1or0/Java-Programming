package Functions;
import java.lang.Math;
import java.util.Scanner;

public class Exponent{
    public static double power(int x, int n){
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int number = s.nextInt();
        System.out.print("Enter its power:-");
        int power = s.nextInt();
        System.out.println("Value:-"+ power(number,power));
        s.close();
    }
}

