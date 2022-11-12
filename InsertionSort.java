import java.util.Scanner;

public class InsertionSort {
    void input(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
    }

    void sort(int[] arr){
        for (int i = 1; i < arr.length; ++i) {
            int j = i-1; 
            int key = arr[i];
            while (j>=0 && arr[j]>key) {
                arr[j + 1] = arr[j];
                j = j - 1;
             }
             arr[j+1] = key;

        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        InsertionSort in = new InsertionSort();
        in.input(arr);
        in.sort(arr);
        in.printArray(arr);
        s.close();
    }
}

