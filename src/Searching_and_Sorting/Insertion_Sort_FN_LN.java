package Searching_and_Sorting;

import java.util.*;

public class Insertion_Sort_FN_LN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] firstNames = new String[size];
        String[] lastNames = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        for(int i = 1; i < size; i++){
            int j = i - 1;
            String key = firstNames[i];
            while(j >= 0 && firstNames[j].compareTo(key) > 0){
                firstNames[j + 1] = firstNames[j];
                j--;
            }
            firstNames[j + 1] = key;
            j = i - 1;
            key = lastNames[i];
            while(j >= 0 && lastNames[j].compareTo(key) < 0){
                lastNames[j + 1] = lastNames[j];
                j--;
            }
            lastNames[j + 1] = key;
        }

        for(String str: firstNames){
            System.out.println(str);
        }
        for(String str: lastNames){
            System.out.println(str);
        }
    }
}
