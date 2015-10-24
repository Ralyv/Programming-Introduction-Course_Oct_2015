import java.util.Scanner;

public class Homework_3_Task_06 {

	public static void main(String[] args) {
		Scanner inputA  = new Scanner(System.in);
		System.out.println("Please enter a real number: ");
		double x = inputA.nextDouble();
		
		System.out.println("Please enter a integer: ");
		int y = inputA.nextInt();
		
		double c = x/y;
		
		System.out.println("The real number is: " + x);
		System.out.println("The integer is: " + y);
		System.out.println("The result is: " + c);

	}

}
