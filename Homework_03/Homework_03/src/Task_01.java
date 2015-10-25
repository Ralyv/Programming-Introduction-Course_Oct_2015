
import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {
		Scanner task01 = new Scanner(System.in, "UTF-8");
		System.out.println("First int number is: ");
		int x = task01.nextInt();

		System.out.println("Second int number is: ");
		int y = task01.nextInt();

		int result = x + y;

		System.out.print("The result is: " + result);

		task01.close();
	}

}

