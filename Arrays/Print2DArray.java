package Arrays;
import java.util.Scanner;

public class Print2DArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the size of rows = ");
    int rows = s.nextInt();
    System.out.print("Enter the size of cols = ");
    int cols = s.nextInt();
    int arr[][] = new int[rows][cols];
    System.out.print("Enter the numbers in arrays = "); 
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j] = s.nextInt();
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
     }    
    s.close();
  }  
}
