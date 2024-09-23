import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int[] sortedArray1 = new int[sizeArray1];
        for(int i = 0;i < sizeArray1; i++){
            sortedArray1[i] = scanner.nextInt();
        }
        int sizeArray2 = scanner.nextInt();
        int[] sortedArray2 = new int[sizeArray2];
        for(int i = 0;i < sizeArray2; i++){
            sortedArray2[i] = scanner.nextInt();
        }

        int[] descendingMerge=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        for(int i = 0; i < sizeArray1 + sizeArray2; i++){
            System.out.println(descendingMerge[i]);
        }
        // write your code here
    }
    public static int[] mergeBothInDescendingOrder(int[] arr1, int[] arr2){
        int sizeArray1 = arr1.length;
        int sizeArray2 = arr2.length;
        int l = sizeArray1 - 1, r = sizeArray2 - 1, i = 0;
        int[] temp = new int[sizeArray1 + sizeArray2];
        while(l >= 0 && r >= 0){
            if(arr1[l] >= arr2[r]){
                temp[i++] = arr1[l--];
            }else{
                temp[i++] = arr2[r--];
            }
        }
        while(l >= 0){
            temp[i++] = arr1[l--];
        }
        while(r >= 0){
            temp[i++] = arr2[r--];
        }
        return temp;
    }
}
