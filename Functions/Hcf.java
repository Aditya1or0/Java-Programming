package Functions;
import java.util.Scanner;

public class Hcf {
    //Brute Force Method
    public static int hcf(int x, int y){
        int Min= Math.min(x,y);
        for(int i=Min;i>=i;i--){
            if(x%i==0 && y%i==0){
                return i;
            }

        }
        return 1;
    }
    //Euclid Method
     public static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
            if(a!=0){
                return a;
            }
            else{
                return b;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x = s.nextInt();
        System.out.print("Enter Secxond Number:");
        int y = s.nextInt(); 
        // System.out.println("HCF of " + x+ "and"+ y+ "is: " +hcf(x,y));
         System.out.println("HCF of " + x + " and " + y + " is: "+gcd(x,y));

        s.close();

    }
    
}
