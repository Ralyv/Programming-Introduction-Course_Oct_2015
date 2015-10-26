import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
		Scanner task02 = new Scanner(System.in);
		System.out.println("Please, type the word: ");
		String text = task02.nextLine();

		System.out.println("Your word is: " + text);

		boolean result = text.contains("Hello");

		System.out.print("The result is: " + result);

		task02.close();
	}

}

