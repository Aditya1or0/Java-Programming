package Basics;

public class Pat {
    public static void main(String[] args) {
        int n =5;
            for(int i=1;i<=n;i++){                                              
            //      1
            //     212
            //    32123
            //   4321234
            //  543212345
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(((i-j)+1));
                }
                 for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
               
                System.out.println();
            }
        }
}
    
