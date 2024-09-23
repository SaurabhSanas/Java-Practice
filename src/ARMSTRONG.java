import java.util.*;
public class ARMSTRONG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];

        for(int i = 0; i < n; i++){
            k[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int sum = 0;
            int j = k[i];
            while(true){
                if(j == 0)
                    break;
                sum += (j%10)*(j%10)*(j%10);
                j /= 10;
            }
            if(sum == k[i]){
                System.out.println("Armstrong");
            }else{
                System.out.println("Not Armstrong");
            }
        }

    }
}
