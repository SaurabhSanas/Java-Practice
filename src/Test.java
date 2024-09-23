import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");*/
        List<Integer> num = new LinkedList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        iterate(num);
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }
        for(int i = k; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void iterate(List<Integer> num) {
        ListIterator<Integer> it = num.listIterator(num.size());
        while(it.hasPrevious()) {
            if(it.hasPrevious()) {
                System.out.println(it.previous());
            }
            it.previous();
        }
    }
}