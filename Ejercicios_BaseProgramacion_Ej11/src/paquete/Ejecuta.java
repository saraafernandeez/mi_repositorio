package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
			11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
			como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
			el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
			año de nacimiento.
		*/
		
		String nombre;
		String nombreMenor = null;
		String mensaje = null;
		int anoNacimiento;
		int edad;
		int suma = 0; // acumulador
		float media;
		int menor = Integer.MAX_VALUE;
		int contEdad = 0; // contador
		Scanner sc = new Scanner(System.in);
		int anoActual = Calendar.getInstance().get(Calendar.YEAR);
		
		boolean continuar = true;
		
		do
		{
			System.out.println("Introduzca nombre: ");
			nombre = sc.nextLine();
			
			if(nombre.equals("fin"))
			{
				continuar = false;
			}
			else
			{
				System.out.println("Introduzca el año de nacimiento: ");
				anoNacimiento = Integer.valueOf( sc.nextLine() );
				
				edad = anoActual - anoNacimiento;
				
				suma += edad; //suma = suma + edad;
				
				if(edad < menor)
				{
					menor = edad;
					nombreMenor = nombre;
				}
			}
		}
		while(continuar); // Mientras el nombre no sea igual a "fin"
		
		sc.close();
		
		if(contEdad > 0)
		{
			media = (float)suma/ (float)contEdad;
			mensaje = "El más joven tiene se llama " + nombreMenor + ", y la media de edad es " + media + ".";
		}
		System.out.println(mensaje);
	}
}