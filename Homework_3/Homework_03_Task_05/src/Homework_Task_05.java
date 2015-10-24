import java.util.Scanner;

public class Homework_Task_05 {

	public static void main(String[] args) {
		Scanner task05  = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter the first phrase: ");
		String phrase01 = task05.nextLine();
		
		System.out.println("Please enter the second phrase: ");
		String phrase02 = task05.nextLine();
		
		String c = phrase01 + "_" + phrase02;
		
		System.out.println("The first phrase is: " + phrase01);
		System.out.println("The second phrase is: " + phrase02);
		System.out.println("The final phrase is: " + c);

	}

}
