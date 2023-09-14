
import java.util.Scanner;

public class Operations {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber = in.nextInt();
		
		System.out.println("Enter the second number");
		int secondNumber = in.nextInt();
		
		System.out.println("Difference = " + (firstNumber - secondNumber));
	}
}
