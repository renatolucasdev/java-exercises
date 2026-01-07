import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		float weigth = 0.0f;
		float heigth = 0.0f;
		float bmi = 0.0f;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weigth: ");
		weigth = sc.nextFloat();
		System.out.print("Enter your heigth: ");
		heigth = sc.nextFloat();
		sc.close();

		if (heigth > 0) {
			bmi = (weigth / (heigth * heigth));
			System.out.println("Your BMI: " + bmi);
			if (bmi < 18.5) {
				System.out.println("You are underweigth.");
			}else if (bmi >= 18.5 && bmi < 25 ) {
				System.out.println("Normal weigth");
			}else if (bmi >= 25 && bmi < 30 ) {
				System.out.println("You are overweigth.");
			}else {
				System.out.println("You are obese. See a doctor.");
			}
		} else {
			System.out.println("The height must be greater than zero");
		}

	}
}