import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		Scanner task07 = new Scanner(System.in);
		System.out.println("Please enter the first text");
		String text01 = task07.nextLine();

		System.out.println("Please enter the second text");
		String text02 = task07.nextLine();

		System.out.println("The first text is: " + text01);
		System.out.println("The first text is: " + text02);

		boolean result = text01.contains(text02);
		System.out.println("The first text contains second text: " + result);

		task07.close();

	}

}
