// Pattern Rectangle
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Printing a rectangle ***");
        System.out.print("Enter the no. of rows ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of coloumn ");
        int m = sc.nextInt();
         //inner 'for loop' for coloumn and outer for rows
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
