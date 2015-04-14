package maximo_comun_divisor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Eucly eucly = new Eucly();
		Scanner in = new Scanner(System.in);
		System.out.println("Vamos a calcular el m�ximo com�n divisor de dos numeros.");
		System.out.print("Introduzca el primer n�mero: ");
		int m = in.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		int n = in.nextInt();
		
		int mcd = eucly.mcd(m, n);
		System.out.println("\nEl m�ximo com�n divisor es: " + mcd);
		
		int mcm = eucly.mcm(m, n);
		System.out.println("\nEl m�nimo com�m m�ltiplo es: " + mcm);
	}

}
