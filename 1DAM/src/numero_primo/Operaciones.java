package numero_primo;

public class Operaciones {

	public static boolean esPrimo(int numero){
        if(numero>0){
            boolean esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if(numero%i==0){
                    esPrimo = false;
                }
            }
            return esPrimo;
        } else{
            System.err.println("Debe introducir un número mayor que 0!!");
            return false;
        }
    }
}
