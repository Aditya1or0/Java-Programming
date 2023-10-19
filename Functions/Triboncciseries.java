package Functions;

import java.util.Scanner;

public class Triboncciseries{
    static void fibonacci(int n){
        int a = 0; int b = 1; int c = 2; int d;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            d = a + b + c;
            a = b;
            b = c;
            c = d;
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

