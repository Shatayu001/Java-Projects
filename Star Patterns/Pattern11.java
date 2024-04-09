// Solid Rhombus
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing Solid Rhombus");
        System.out.print("Enter the no. of rows => ");
        int n = sc.nextInt();
        for(int i = 1 ; i<= n ; i++){
            int spaces = n - i ;
            for(int j = 1; j<= spaces ; j++){
            System.out.print(" ");
            }
            for(int j = n ; j >= 1 ; j--){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}