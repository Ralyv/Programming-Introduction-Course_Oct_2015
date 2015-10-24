import java.util.Scanner;

public class Lazar_likes_domati {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in, "UTF-8");
		System.out.println("His name is: ");
		String name = input.nextLine();
		
		System.out.println("He likes: ");
		String newname = input.nextLine();
		
		String task = name + " \"likes\" " + newname;
		
		// System.out.println(name);
	    // System.out.println(newname);
	       System.out.print(task);
		}
	

	}


