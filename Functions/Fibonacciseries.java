package Functions;

import java.util.Scanner;

public class Fibonacciseries {
    static void fibonacci(int n){
        int a = 0; int b = 1; int c;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        } 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Term = ");
        int n = s.nextInt();
        fibonacci(n);
        s.close();
    }  
}
