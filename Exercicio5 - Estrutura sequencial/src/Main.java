import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int peca1,peca1Number,peca2,peca2Number;
		double peca1Value,peca2Value;
		
		peca1 = sc.nextInt();
		peca1Number = sc.nextInt();
		peca1Value = sc.nextDouble();
		
		peca2 = sc.nextInt();
		peca2Number = sc.nextInt();
		peca2Value = sc.nextDouble();
		
		sc.close();
		
		double value;
		value = (peca1Number*peca1Value) + (peca2Number*peca2Value) ;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",value);

	}

}
