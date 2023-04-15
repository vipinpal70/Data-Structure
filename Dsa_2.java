 // Find the maximum and minimum element in an array  -->

public class Dsa_2 {
    public static void main(String[] args) {
        int arr[] = {10,65,78,98,16,48,28,35,68,99};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if(i>max)
                max = i;
            if(i<min)
                min = i;
        }
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);

    }
}
