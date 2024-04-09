//inverted half pyramid with numbers
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Printing inverted half pyramid with numbers ***");
        System.out.print("Enter the no. of Rows => ");
        int n = sc.nextInt();
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
