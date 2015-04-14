package maximo_comun_divisor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Eucly eucly = new Eucly();
		Scanner in = new Scanner(System.in);
		System.out.println("Vamos a calcular el máximo común divisor de dos numeros.");
		System.out.print("Introduzca el primer número: ");
		int m = in.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int n = in.nextInt();
		
		int mcd = eucly.mcd(m, n);
		System.out.println("\nEl máximo común divisor es: " + mcd);
		
		int mcm = eucly.mcm(m, n);
		System.out.println("\nEl mínimo comúm múltiplo es: " + mcm);
	}

}
