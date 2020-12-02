import java.util.Scanner;
import java.util.InputMismatchException;

public class KeyboardInput {
	private static Scanner in = new Scanner(System.in);
	
	public String strIn() {
		/*
		String input = "";
		do {
			try {
				input = in.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input");
			}
		}while()
		*/
		return in.nextLine();
	}
	
	public int intIn() {
		return in.nextInt();
	}

	
}
