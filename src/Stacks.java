import java.util.Scanner;

public class Stacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top1 = -1, top2 = n;
        String str;

        int[] arr = new int[n];

        while(sc.hasNext()){
            str = sc.next();
            if(str.equals("Push1")){
                if(top1 + 1 < top2){
                    int a = sc.nextInt();
                    top1++;
                    arr[top1] = a;
                }else{
                    System.out.println("Stack Full");
                }
            }
            if(str.equals("Pop1")){
                if(top1 != -1){
                    System.out.println(arr[top1--]);
                }
                else{
                    System.out.println("Cannot remove any further");
                }
            }
            if(str.equals("Push2")){
                if(top1 + 1 < top2){
                    int a = sc.nextInt();
                    top2--;
                    arr[top2] = a;
                }else{
                    System.out.println("Stack Full");
                }
            }
            if(str.equals("Pop2")){
                if(top2 != n){
                    System.out.println(arr[top2++]);
                }
                else{
                    System.out.println("Cannot remove any further");
                }
            }
            if(str.equals("Exit")){
                break;
            }
        }
    }
}
