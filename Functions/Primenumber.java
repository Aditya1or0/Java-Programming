package Functions;

import java.util.Scanner;

public class Primenumber {
    public static void prime(int x){
        if(x%x==0 && x%1==0 && x%3!=1){
                System.out.println("It is Prime number");
            }
            else{
                System.out.println("It is not a Prime number");
            }
    }
    public static void printPrime(int n){
        for(int i=2;i<=n*2;i++){
            if(i==2 || i==3 || i==5 || i==7){
                System.out.println(i);
            }
             if(i%i==0 && i%1==0){
                if(i%3!=0 && i%2!=0 && i%7!=0 && i%5!=0){
                System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
         System.out.print("How many Prime Numbers you want to print: ");
         int n = s.nextInt();
        printPrime(n);
        s.close();
    }  
}
//Time Complexity :- O(n^2)