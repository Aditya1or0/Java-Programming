package Basics;
import java.util.Scanner;
public class UpperCaseAndLowerCase{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Character = ");
        char ch = s.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            char ch1 = Character.toLowerCase(ch);
            System.out.print(ch1);
        }
        else{
            char ch2 = Character.toUpperCase(ch);
            System.out.print(ch2);
        }
        s.close();
    }
}