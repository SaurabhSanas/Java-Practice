public class Prime_Numbers {

    public static void main(String[] args){
        int n = 50;

        if(n > 1)
            System.out.println(2);
        if(n > 2)
            System.out.println(3);
        for(int i = 5; i <= n; i += 2){
            if(i%6 == 1 || i%6 == 5){
                int j = 5;

                boolean isPrime = true;
                while(j*j <= i){
                    if(i % j == 0 || i % (j+2) == 0) {
                        isPrime = false;
                        break;
                    }
                    j += 6;
                }
                if(isPrime)
                    System.out.println(i);
            }
        }
    }
}
