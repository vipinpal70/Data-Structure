//  Reverse the array  -->   1st program
public class Dsa_1 {

    //Method for reverse array
    public static void Reverse(int arr[]){
        int l =  arr.length -1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;   
            l--;
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,15,48,23,10,45,89,11};
        Reverse(arr);  // for reverse 
        for (int i : arr) {  // for printing array after reverse
            System.out.print(" " + i);    
        }
    }
}