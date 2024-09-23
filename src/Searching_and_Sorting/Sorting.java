package Searching_and_Sorting;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Sorting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        long startTime, endTime;
        Random r = new Random();
        int[] array = new int[n];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = r.nextInt(n);
        }

        System.arraycopy(array, 0, arr, 0, n);

        System.out.println("Elements in the array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println();

        //Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(array);
        endTime = System.nanoTime();
        System.out.println("\nElements in the bubble sorted array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println("\nTime taken by bubble sort: " + (endTime - startTime));
        System.out.println("\n");

        System.arraycopy(arr, 0, array, 0, n);

        //Selection Sort
        startTime = System.nanoTime();
        selectionSort(array);
        endTime = System.nanoTime();
        System.out.println("Elements in the selection sorted array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println("\nTime taken by selection sort: " + (endTime - startTime));
        System.out.println("\n");

        System.arraycopy(arr, 0, array, 0, n);

        //Insertion Sort
        startTime = System.nanoTime();
        insertionSort(array);
        endTime = System.nanoTime();
        System.out.println("Elements in the insertion sorted array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println("\nTime taken by insertion sort: " + (endTime - startTime));
        System.out.println("\n");

        System.arraycopy(arr, 0, array, 0, n);

        //Quick Sort
        startTime = System.nanoTime();
        quickSort(array, 0, n - 1);
        endTime = System.nanoTime();
        System.out.println("Elements in the quick sorted array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println("\nTime taken by quick sort: " + (endTime - startTime));
        System.out.println("\n");

        System.arraycopy(arr, 0, array, 0, n);

        //Merge Sort
        startTime = System.nanoTime();
        mergeSort(array, 0, n - 1);
        endTime = System.nanoTime();
        System.out.println("Elements in the merge sorted array :");
        for(int i = 0; i < n; i++) System.out.print(array[i] + " ");
        System.out.println("\nTime taken by merge sort: " + (endTime - startTime));
        System.out.println();

        int result = binarySearch(array, 0, n -1, 10);
        if(result != -1){
            System.out.println(result);
        }else{
            System.out.println("Not_Found !");
        }

    }

    private static void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++)
                if(array[j] < array[min])
                    min = j;
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= key;
        }
    }

    private static int partition(int[] array, int low, int high){
        int pivot = high;
        int p = low, temp;
        for(int i = low; i < high; i++){
            if(array[i] <= array[pivot]){
                temp = array[p];
                array[p] = array[i];
                array[i] = temp;
                p++;
            }
        }
        temp = array[p];
        array[p] = array[pivot];
        array[pivot] = temp;
        return p;
    }

    private static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivotPos = partition(array, low, high);
            quickSort(array, low, pivotPos-1);
            quickSort(array, pivotPos+1, high);
        }
    }

    private static void merge(int[] array, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = array[l + i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2){
            if(L[i] < R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] array, int l, int r){
        if(l < r){
            int mid = (r - l) / 2 + l;
            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);
            merge(array, l, mid, r);
        }
    }

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
                //condition to check if it is the first occurrence of the element.
                if(array[M - 1] != key){
                    return M;
                }
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
