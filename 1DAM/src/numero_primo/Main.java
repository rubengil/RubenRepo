package numero_primo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero;
        boolean esPrimo;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un n�mero positivo: ");
        numero = in.nextInt();
        esPrimo = Operaciones.esPrimo(numero);
        
        if(esPrimo){
            System.out.println("El n�mero " + numero + " es primo.");
        } else{
            System.out.println("El n�mero " + numero + " no es primo.");
        }
	}

}
