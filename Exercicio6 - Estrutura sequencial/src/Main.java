import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double triangulo,circulo,trapezio,quadrado,retangulo,A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		sc.close();
		
		triangulo = (A*C)/2;
		circulo = 3.14159*Math.pow(C, 2);
		trapezio = (A+B)*C/2;
		quadrado = B*B;
		retangulo = A*B;
		
		Locale.setDefault(Locale.US);
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangulo,circulo,trapezio,quadrado,retangulo);
				
	}

}
