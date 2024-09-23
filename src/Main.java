import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        //Sort array
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(array[i] + " ");
        }

        //Find Sum Pair
        /*System.out.println("Enter number for searching");
        int k = input.nextInt();
        int i = 0;
        int j = array.length - 1;
        boolean found = false;

        while(i <= j){
            if(array[i] + array[j] == k){
                found = true;
                break;
            }else if(array[i] + array[j] < k){
                i++;
            }else{
                j++;
            }
        }

        if(found){
            System.out.println(i+1 + " " + j+1);
        }else{
            System.out.println("Not found");
        }*/

        //Binary Search
        /*System.out.println(array[n-1]);

        System.out.println("Enter number for searching");
        int k = input.nextInt();

        int pos = binarySearch(array, k);
        if(pos >= 0){
            System.out.println(k + " is located at " + pos);
        }*/

        /*Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Saurabh";
        s2.name = "ABC";
        s1.setCgpa(9.99);
        s2.setCgpa(9.9);

        System.out.println(s1.FindPercentage());
        System.out.println(s2.FindPercentage());

         */

        /*char ch = 97;
        while(ch < 123){
            System.out.print(ch++);
        }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Cappuccino,code:1\n" +
                "Espresso,code:2\n" +
                "Latte,code:3\n" +
                "Milk,code:4");
        int code = sc.nextInt();
        Switch.Drink(code);*/
        //Attendance Percentage
         /*System.out.println("Number of classes: ");
         int total=sc.nextInt();
         System.out.println("Number of classes attended: ");
         int attended =sc.nextInt();
         int attendance = attended * 100 / total;
         System.out.println("Attendance Percentage: " + attendance);
         if(attendance < 75){
             System.out.println("Need to pay Fees.");
         }
         else {
             System.out.println("No need to pay Fees.");
         }*/


        //Tickets available
        /*System.out.println("Number of tickets: ");
        int tickets = sc.nextInt();
        System.out.println("Number of People: ");
        int people = sc.nextInt();
        if(tickets>=people)
        {
            System.out.println("Enough Tickets");
        }
        else {
            System.out.println("Not Enough");
        }*/

        //Divisibility
        /*System.out.println("Enter the Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the Divisor: ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        if(remainder == 0){
            System.out.println(dividend + " is divisible by " + divisor +
                    ".\nQuotient: " + quotient);
        }
        else {
            System.out.println(dividend + " is not divisible by " + divisor +
                    "\nRemainder: " + remainder);
        }*/
        //Odd OR Even
        /* System.out.print("Number: ");
        int num = sc.nextInt();
        

        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
        else{
            System.out.println(num + " is an odd number.");
        } */

        //int max = maxElement(a);
        //System.out.println(max);
//===========================================================================================================
        /*System.out.println("Enter a number: ");
        int n = sc.nextInt(), i = 1;
        System.out.print("Factors: ");

        while(i != 0) {
            if(n % i == 0){
                System.out.print(i + ", ");
            }
            i++;
        }*/

        /*
        System.out.print("Enter lenght of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = 0;
        do {
            System.out.print("\nEnter "+ i+1 +"th element:" );
            a[i] = sc.nextInt();
            i++;
        }while(i < n);
        */

        /*
        int sum = 0;
        int i = 0;
        do {
            sum += a[i];
            i++;
        }while(i < n);

        System.out.println("Average: " + sum / n);
        */

        /*int prod = 1;
        int i = 0;
        do {
            prod *= a[i];
            i++;
        }while(i < n);

        System.out.println("Product: " + prod);
        */

        /*
        int min = a[0], max = 0;
        for(i = 0; i < n; i++)
        {
            if(min > a[i])
                min = a[i];
            if(max < a[i])
                max = a[i];
        }

        System.out.println("Minimum element: "+min+"\nMaximum element: "+max);
        */

        /*
        System.out.println("Enter Username: ");
        String Username = sc.nextLine();
        System.out.println("Enter Password: ");
        String Password = sc.nextLine();
        boolean a = verify(Username, Password);
        System.out.println(a);
         */
        /*
        int a = 10;
        int b = 5;
        double c = a / b;
        System.out.println(c);
        int x = 3%2; int y = 4; double z = x/y; System.out.println(z);
        */

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        float b = input.nextFloat();
        double c = input.nextInt();

        int z = a + (int)b;
        float y = a + (int)c;
        double x = a + (int)b + (float)c;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
         */

        /*int speed1 = 15;
        double speed2 = speed1*(5/18);
        System.out.println(speed2);
         */
        /*double income = 900000;
        int p = 20;
        double tax = income * p / 100;
        System.out.println(tax);*/
    }

    public static boolean verify(String a, String b)
    {
        return a.equals("upgrad") && b.equals("upgrad2023");
    }

    public static int maxElement(int []a){
        int max = a[0];
        for(int i = 1; i < a.length; i++)
            if(max < a[i])
                max = a[i];
        return max;
    }

    public static int addition(int a, int b, int c){
            return a + b + c;
    }

    public static int binarySearch(int[] array, int k){
        int mid;
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            mid = start + (end-start)/2;
            if(array[mid] == k){
                return mid;
            } else if (k < mid) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
