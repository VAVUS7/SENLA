package senla;

import java.util.Scanner;
import static java.lang.Math.*;

public class N3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(intersection(
                sc.nextDouble(), sc.nextDouble(), 
                sc.nextDouble(), sc.nextDouble(), 
                sc.nextDouble(), sc.nextDouble(), 
                sc.nextDouble(), sc.nextDouble()
                ) ? "пересекаются" : "не пересенкаются"
        );
    }
    
    static boolean intersection(
            double ax1, double ay1, double ax2, double ay2, 
            double bx1, double by1, double bx2, double by2)
    {
        double 
                v1 = (bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1),
                v2 = (bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1),
                v3 = (ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1),
                v4 = (ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
        
        double 
                minax = min(ax1, ax2), maxax = max(ax1, ax2),
                minbx = min(bx1, bx2), maxbx = max(bx1, bx2),
                minay = min(ay1, ay2), maxay = max(ay1, ay2),
                minby = min(by1, by2), maxby = max(by1, by2);
        return (v1*v2<=0) && (v3*v4<=0) 
                && (minax <= maxbx && minax >= minbx || maxax <= maxbx && maxax >= minbx)
                && (minay <= maxby && minay >= minby || maxay <= maxby && maxay >= minby);
    }
}
