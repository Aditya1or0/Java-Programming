package Basics;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = s.nextInt();
        System.out.print("The factor is = ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + "," );
            }
        }
        s.close();
    }
}
