import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A;
		double B,C,D;
		
		A = sc.nextInt();
		B = sc.nextDouble();
		C = sc.nextDouble();
		sc.close();
		
		D = B*C;
		
		Locale.setDefault(Locale.US);
		System.out.printf("NUMBER = %d%nSALARY = %.2f",A,D);
	}

}
