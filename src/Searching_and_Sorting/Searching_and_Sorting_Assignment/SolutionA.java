package Searching_and_Sorting.Searching_and_Sorting_Assignment;
import java.util.Scanner;

public class SolutionA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Take input N as the number of elements in array.
        int N = sc.nextInt();
        int[] array = new int[N+1];

        //Take N number of inputs as the elements in array.
        for(int i = 1; i <= N; i++){
            array[i] = sc.nextInt();
        }

        /*Variable start and end store the starting and ending position of the section of array to be searched.
        Initially start and end both point respectively to the start and end of the initial array.
        Either variables will change as we divide the search area.*/
        int start = 1, end = N;
        //Variable to store the status of search.
        boolean found = false;
        //Variable M stores the middle position of the search portion.
        int M = start + (end - start) / 2;


        //The loop will iterate till start is less than or equal to end.
        while(start <= end){
            /*These nested conditions checks if the element at the Mth position is equal to M and is first such element.
            If the conditions are satisfied, found is set to true and the loop is exited.*/
            if(array[M] == M) {
                if (array[M - 1] != M - 1) {
                    found = true;
                    break;
                }
            }
            /*start will move one position ahead of middle if the element at Mth position is less than M, otherwise
            end will move to M.*/
            if(array[M] < M){
                    start = M + 1;
            }else{
                end = M;
            }
            //M updates according to the new start and end positions.
            M = start + (end - start) / 2;
        }
        //If found is true then the element at Mth position which is same as M, is printed. Otherwise, "NOT_FOUND".
        if(found){
            System.out.println(M);
        }else{
            System.out.println("NOT_FOUND");
        }
    }
}