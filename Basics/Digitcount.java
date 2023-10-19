package Basics;
import java.util.Scanner;
public class Digitcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("Total Digits= "+count);
        s.close();
    }
    
}
