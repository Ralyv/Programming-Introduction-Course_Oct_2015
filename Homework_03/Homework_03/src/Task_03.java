
import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {
		Scanner task03 = new Scanner(System.in);
		System.out.println("a = ");
		int a = task03.nextInt();

		System.out.println("h = ");
		int h = task03.nextInt();
		double S = (a * h) / 2d;

		System.out.println("a = " + a);
		System.out.println("h = " + h);
		System.out.print("S = (a*h)/2 = " + S);
		
		task03.close();
	}

}