import java.util.Scanner;

class Demo {
    public static String func(int n) {
        //write your code here
        if(n < 1){
            return "";
        }
        String temp = "*";
        temp += func(n - 1);
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(arr.length);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        String str = sc.next();
        System.out.println(str.length() + arr.length);
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        if(n < 1)
            return 1;
        int r = n*lastNonZeroDigit(n-1);
        if(r % 10 == 0)
            r /= 10;
        return r % 10;
    }

    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int result = power(x, n/2);
        result *= result;
        if(n % 2 == 0)
            return result;
        return result * x;
    }
}