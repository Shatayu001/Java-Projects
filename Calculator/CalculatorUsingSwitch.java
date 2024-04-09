// Calculator using switch statement
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============== CALCULATOR ==============");
        System.out.println("1) Addition");
        System.out.println("2) Substraction");
        System.out.println("3) Division");
        System.out.println("4) Multiplication");
        System.out.print("What you have to perform? ");
        int ch = sc.nextInt();
        System.out.print("Enter 1st no.=> ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd no.=> ");
        double b = sc.nextDouble();
        switch(ch){
            case 1:
            double c = a + b;
            System.out.println("The Addition => "+ c );
            break;
            case 2:
            double d = a - b;
            System.out.println("The Substraction => "+ d );
            break;
            case 3:
            if(b < 1 ){
                System.out.println("Error: Division by zero is not allowed ");
                break;
            }
            double e = a / b;
            System.out.println("The Division => "+ e );
            break;
            case 4:
            double f = a * b;
            System.out.println("The Multiplycation => "+ f );
            break;
            default:
            System.out.println("Enter Valid Input ");
            break;
        }
        
    }
}
