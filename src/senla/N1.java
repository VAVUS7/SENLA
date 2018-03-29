package senla;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(N >= 2) System.out.println(2);
        label1:
        for(long n = 3; n < N; n+=2){;
            for(long d = 3; d <= n/2; d++)
                if((n % d) == 0) continue label1;
            System.out.println(n);
        }
    }
}
