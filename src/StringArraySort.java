import java.util.Scanner;

public class StringArraySort {
    public static void quickSort(String[] array, int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }
    //Write your code here
    public static int partition(String[] array, int left, int right){
        int p = left;
        String pivot = array[right];
        for(int i = left; i < right; i++){
            if(array[i].length() <= pivot.length()){
                String temp = array[i];
                array[i] = array[p];
                array[p] = temp;
                p++;
            }
        }
        String temp = array[p];
        array[p] = array[right];
        array[right] = temp;

        return p;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.next();
        }

        quickSort(array, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}
