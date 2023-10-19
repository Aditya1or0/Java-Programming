package Functions;

import java.util.Scanner;

public class Lcm {
    public static int lcm(int x, int y){
            int Max= Math.max(x,y);
            while(true){
                if(Max%x==0 && Max%y==0){
                    break;      
                }
                Max--;
            }
            return Max;
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x = s.nextInt();
        System.out.print("Enter Secxond Number:");
        int y = s.nextInt(); 
        System.out.println("LCM of " + x + " and " + y + " is: "+lcm(x,y));
        s.close();
    }   
}
