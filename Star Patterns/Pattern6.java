//half pyramid with numbers
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Printing half pyramid with numbers *** ");
        System.out.print("Enter the num of rows => ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j =1 ; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
