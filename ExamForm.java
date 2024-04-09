import java.util.Scanner;
public class ExamForm {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("_________________________");
		System.out.println("****Student Exam Form****");
		System.out.println("1)Regular Exam Form");
		System.out.println("2)Backlog Exam Form");
		System.out.printf("Enter the Choise: ");
		int ab = sc.nextInt();
		sc.nextLine();
		switch(ab){
		case 1:{
			System.out.print("Enter Your Name: ");
			String name = sc.nextLine();
			System.out.printf("Enter Year 1st/2nd/3rd/4th : ");
			int year = sc.nextInt();
			System.out.printf("Enter Your Total Subject number:  ");
			int subn = sc.nextInt();
			String[] sub = new String[8];
			System.out.println("-------Student Info---------");
			System.out.println("Name: "+ name);
			System.out.println("Year: "+ year);
			System.out.println("Subject No: "+subn);
			System.out.print("Check Your Info : ");
			String check = sc.next();
			String a = "ok";
				if(check.equals(a)){
					System.out.println("Form Submitted..!! ");
				}
				else{
					System.out.println("Reenter your info");
				}
			
			}
			
		}
	}
}

