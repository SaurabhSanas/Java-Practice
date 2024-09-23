import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\LENOVO\\IdeaProjects\\Upgrad\\src\\Test_File_numbers.txt");
        Scanner sc = new Scanner(inputFile);

        int sum = 0;
        int numCount = 0;
        while(sc.hasNext()){
            int number = sc.nextInt();

            sum += number;
            numCount++;
        }
        double mean = (double) sum / numCount;
        System.out.println("\nMean of all the numbers is " + mean);

        int[] array = {5, 4, 3, 2, 1};
        printBackwards(array);

        try {
            fun(50);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

    static void fun(int n) {
        if (n < 60)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible for pension");
    }

    public static void printBackwards(int[] numbers) {
        for(int i=numbers.length-1; i > 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
