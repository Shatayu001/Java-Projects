//Number Pyramid
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Printing Number Pyramid ***");
        System.out.print("Enter the no. of Rows => ");
        int n = sc.nextInt();
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
