
import java.util.Scanner;

public class Task_04 {

	public static void main(String[] args) {
		Scanner task04 = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter the first integer: ");
		int x = task04.nextInt();

		System.out.println("Please enter the second integer: ");
		int y = task04.nextInt();

		int c = x % y;

		System.out.println("The first integer = " + x);
		System.out.println("The second integer = " + y);
		System.out.println("The result is = " + c);

		task04.close();
	}

}