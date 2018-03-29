package senla;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        if(new StringBuilder(st).reverse().toString().equals(st))
            System.out.println("полиндроп");
        else
            System.out.println("не полиндроп");
        
    }
}
