package Arrays;
import java.util.Scanner;

public class SearchIn2DArrays {
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
        System.out.print("What number you want to search = ");
        int x = s.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){ 
                if(arr[i][j] == x){
                    System.out.print("The number is at index of = (" + i +"," +j +")");
                } 
            }
        }           
        s.close();
    }  
}

    

