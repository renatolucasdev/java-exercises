import java.util.Scanner;

public class UserInputExercise {
	public static void main (String[] args) {
		String name = "";
		short age = 0;
		float height = 0.0F;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your age: ");
		age = sc.nextShort();
		System.out.print("Enter your height: ");
		height = sc.nextFloat();
		sc.close();
		System.out.println("---------------------------");
		System.out.println("Your name: " + name + "\nYour age: " + age + "\nYour height: " + height);

	}
}