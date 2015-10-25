
import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {
		Scanner task06 = new Scanner(System.in);
		System.out.println("Please enter a real number: ");
		double x = task06.nextDouble();

		System.out.println("Please enter a integer: ");
		int y = task06.nextInt();

		double c = x / y;

		System.out.println("The real number is: " + x);
		System.out.println("The integer is: " + y);
		System.out.println("The result is: " + c);

		task06.close();

	}

}
