package alumno;

import java.util.Scanner;

public class Alumno {

	private String nombre;					
	private String apellidos;				
	private String dni;
	
	public Alumno(){
	}

	
	public static void main(String[] args) {

		Alumno miAlumno = pedirDatos();
		
		mostrarDatos(miAlumno);

		
	}


	private static void mostrarDatos(Alumno miAlumno) {
		System.out.print ("Alumno: " + miAlumno.nombre+" "+miAlumno.apellidos);  
		System.out.print("DNI: "+miAlumno.dni);
	}


	private static Alumno pedirDatos() {
		Alumno miAlumno = new Alumno();
		Scanner teclado = new Scanner (System.in);
		System.out.print("Escriba el nomre del alumno");
		miAlumno.nombre=teclado.nextLine();
		System.out.print("Escriba los apellidos del alumno");
		miAlumno.apellidos=teclado.nextLine();
		System.out.print("Escriba el DNI del alumno");
		miAlumno.dni=teclado.nextLine();
		return miAlumno;
	}

}
