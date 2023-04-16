//Evaluiation of numbers, it may be number or floatinf point , string and also negative  ---> 

import java.util.Scanner;
public class Evaluation {
    public static int cal(int num, int sum) {
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int sumNumbers(String num, int sum) {
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) {
                sum = sum + Integer.parseInt(num.substring(i, i + 1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the Number");
        String num = sc.next();

        if (!num.contains(".") && !num.contains("-") && Integer.parseInt(num) > 0) {
            sum = cal(Integer.parseInt(num), sum);
            System.out.println(sum);

        }
        if (!num.contains(".") && !num.contains("-") && Integer.parseInt(num) < 0) {
            sum = cal(-1 * Integer.parseInt(num), sum);
            System.out.println(-1 * sum);
        }

        if (num.contains(".") && !num.contains("-")) {
            sum = sumNumbers(num, sum);
            System.out.println(sum);
        }
        if (num.contains(".") && num.contains("-")) {
            sum = sumNumbers(num, sum);
            System.out.println(-sum);
        }
        sc.close();
    }

}
