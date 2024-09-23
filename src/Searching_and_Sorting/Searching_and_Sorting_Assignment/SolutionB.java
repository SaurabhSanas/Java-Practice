package Searching_and_Sorting.Searching_and_Sorting_Assignment;
import java.util.Scanner;

public class SolutionB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input N as the number of elements in array.
        int N = sc.nextInt();
        int[] array = new int[N + 1];
        //Take input key as the target to be searched.
        int key = sc.nextInt();

        //Take N number of inputs as the elements in array.
        for (int i = 1; i <= N; i++) {
            array[i] = sc.nextInt();
        }

        int result = searchKey(array, key);
        if(result > 0){
            System.out.println(result);
        }else {
            System.out.println("NOT_FOUND");
        }
    }

    //The method searchKey takes parameters as the array and the key to be searched.
    public static int searchKey(int[] array, int key){
        //Variable M is initialized as 1. It is used to traverse the array.
        int M = 1;

        /*Since we perform comparison operations on elements of array and don't know the length of array,
        if we reach a position out of bounds of the array, the exception is suppressed.*/
        try{
            //if element at Mth i.e. 1st position is equal to the key, M is returned.
            if(array[M] == key){
                return M;
            }
            /*if the Mth i.e. 1st element is greater than the key we won't find it in the sorted array further.
            So -1 is returned.*/
            if(array[M] > key){
                return -1;
            }
            //M is doubled till the Mth element is less than or equal to key.
            while(array[M] <= key){
                M *= 2;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            //Suppressing ArrayIndexOutOfBoundsException.
        }

        /*binarySearch method is called and the returned value is returned by searchKey method as well.
        The start is passed as the last position pointed by M and last is the current position pointed by M.*/
        return binarySearch(array, (M / 2), M, key);
    }

    /*The binarySearch method takes parameters as the array, l pointing to start position and r pointing to end position
     of the portion to be searched and key which is the target element to be searched.*/
    private static int binarySearch(int[] array, int l, int r, int key){
        //M points to the middle position of the array search portion.
        int M = l + (r - l) / 2;
        //The exit condition of recursive function i.e. when l exceeds r. Returns -1 if true.
        if(l > r){
            return -1;
        }
        /*Since we perform comparison operations on elements of array and don't know the length of array,
        if we reach a position out of bounds of the array, the exception is handled.*/
        try{
            //If Mth element is equal to the key then M is returned.
            if(array[M] == key){
                return M;
            }
            /*r i.e. end position is changed to (M - 1)th position if key is less than Mth element.
            Otherwise, l i.e. start position is changed to (M + 1)th position.*/
            if(array[M] > key){
                r = M - 1;
            }else{
                l = M + 1;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            r = M - 1;
        }

        /*Return the results of recursively calling the method with the new values of either l(start position pointer)
        or r(end position pointer).*/
        return binarySearch(array, l, r, key);
    }
}