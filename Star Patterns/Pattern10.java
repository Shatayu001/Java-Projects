// BUtterfly Pattern
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" *** Printing Butterfly Pattern *** ");
        System.out.print("Enter the no. of rows => ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            // upper first half stars
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            //upper space relation
            int spaces = 2*(n-i);
            for(int j = 1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            // upper second half star
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n ; i >= 1 ; i-- ){
            // lower first half
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            //lower spaces relation
            int spaces = 2*(n-i);
            for(int j = 1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            //lower 2nd half star
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
