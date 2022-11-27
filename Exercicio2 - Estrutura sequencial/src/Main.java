import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		double A,B;
		
		x = sc.nextDouble();
		sc.close();
		
		A = Math.pow(x, 2);
		B = A*3.14159;
		
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f%n",B);
	}

}
