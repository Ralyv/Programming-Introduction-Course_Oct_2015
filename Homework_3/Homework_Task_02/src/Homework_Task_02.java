import java.util.Scanner;

public class Homework_Task_02 {

	public static void main(String[] args) {
	Scanner task  = new Scanner(System.in);
    System.out.println("Type the text: ");
    String text = task.nextLine();
    System.out.println("The text is: " + text);
    
    String hi = "Hello";
    boolean result = text == hi;
    
    System.out.print("The word is: " + result);
     
 	}

}
