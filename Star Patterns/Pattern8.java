//Floyd's triangle
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Floyd's triangle");
        System.out.print("Enter no. of rows => ");
        int n = sc.nextInt();
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(num);
                num++;
                }
            System.out.println(" ");
        }
    }
}
