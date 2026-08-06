 import java.util.Scanner;

public class BubbleSort {
     public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
         
        int [] arr = {5 ,2 ,8 ,1 ,4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
       sc.close();
    }
}