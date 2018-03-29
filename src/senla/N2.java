/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senla;

import java.util.Scanner;

/**
 *
 * @author vlad
 */
public class N2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        printFib(1, 0, N);
    }
    
    static void printFib(long f1, long f2, long border){
        long f = f1+f2;
        if(f>0 && f<=border){
            System.out.println(f);
            printFib(f2, f, border);
        }
    }
}
