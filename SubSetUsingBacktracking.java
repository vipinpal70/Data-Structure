// Print all subsets of a given Set or Array

public class SubSetUsingBacktracking {

    public static void subsets(int[] arr, int index, String ans) {
        // base condition
        if (index == arr.length) {
            if (ans.length() == 0) {
                System.out.println("NULL");
            } else
                System.out.println(ans);
            return;
        }
        // recursion

        // yes choice
        subsets(arr, index + 1, ans + arr[index] + " ");
        // no choise
        subsets(arr, index + 1, ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        subsets(arr, 0, "");
    }

}
