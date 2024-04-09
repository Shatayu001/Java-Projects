// Prime Number
import java.util.Scanner;
public class CheckPrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i, k = 0;
        
        for(i = 2; i < n ;i++){
            if(n % i == 0){
                k++;
                break;
            }
        }
        if(k==0){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
        System.out.println();
    }
}
