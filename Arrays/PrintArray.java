package Arrays;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of arrays = ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the numbers in arrays = "); 
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
