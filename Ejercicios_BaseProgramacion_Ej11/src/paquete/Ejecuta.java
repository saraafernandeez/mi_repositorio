package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
			11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
			como nombre de alumno "fin". En ese momento mostrará la edad media de los alumnos y
			el nombre del alumno menor. NOTA: Al introducir como nombre "fin", no nos ha de pedir el
			año de nacimiento.
		*/
		
		String nombre;
		String nombreMenor = "";
		String mensaje = "";
		int anoNacimiento;
		int edad;
		int suma = 0; // acumulador
		float media;
		int menor = Integer.MAX_VALUE;
		int contEdad = 0; // contador
		Scanner sc = new Scanner(System.in);
		int anoActual = Calendar.getInstance().get(Calendar.YEAR);
				
		System.out.println("Introduzca nombre: ");
		nombre = sc.nextLine();
		
		while(nombre.equals("fin")==false)
		{
			System.out.println("Introduzca el año de nacimiento: ");
			anoNacimiento = Integer.valueOf( sc.nextLine() );
			
			edad = anoActual - anoNacimiento;
			contEdad++; // contEdad = contEdad + 1
			suma += edad; //suma = suma + edad;
				
			if(edad < menor)
			{
				menor = edad;
				nombreMenor = nombre;
			}
			
			System.out.println("Introduzca nombre: ");
			nombre = sc.nextLine();	
		}
		
		sc.close();
		
		if(contEdad > 0)
		{
			media = (float)suma/ (float)contEdad;
			mensaje = "La persona más joven se llama " + nombreMenor + ", y la media de edad es " + media + ".";
			System.out.println(mensaje);
		}
		
		// Fin del programa 
	}
}
