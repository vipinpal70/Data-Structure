import java.util.Scanner;

public class BubbleSort {
    void input(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter eleements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
    }
    void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[i];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void display(int[] arr){
        System.out.println("Sorted array.....");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BubbleSort b = new BubbleSort();
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        b.input(arr);
        b.sort(arr);
        b.display(arr);
        s.close();
    }
}
