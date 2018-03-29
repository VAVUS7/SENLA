package senla;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        
        long nod = nod(n1, n2);
        System.out.println("НОД: " + nod);
        System.out.println("НОК: " + (n1*n2)/nod);
    }
    
    static long nod (long n1, long n2) {
        return n2!=0 ? nod(n2, n1%n2) : n1;
    }
}
