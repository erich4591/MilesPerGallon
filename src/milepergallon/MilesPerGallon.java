package milepergallon;
import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[ ] args) {

		Scanner keyboard = new Scanner(System.in);


		System.out.print("How many miles were driven?");
		int miles;
		miles = keyboard.nextInt();

		System.out.print("How many gallons were used?");
		int gallons;
		gallons = keyboard.nextInt();

		int mpg;
		mpg = miles / gallons;

		System.out.println("The Miles-Per-Gallon used in this trip are " + mpg );

	}
}

