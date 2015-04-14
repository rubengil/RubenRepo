package numero_primo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero;
        boolean esPrimo;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un número positivo: ");
        numero = in.nextInt();
        esPrimo = Operaciones.esPrimo(numero);
        
        if(esPrimo){
            System.out.println("El número " + numero + " es primo.");
        } else{
            System.out.println("El número " + numero + " no es primo.");
        }
	}

}
