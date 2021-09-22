package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
			12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
			número es primo si tiene dos únicos divisores que son el 1 y él mismo.		
		*/
		
		int numero;
		int resto;
		boolean primo = true;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		if(numero<2)
		{
			primo = false;
		}
		
		primo = true;
			
		for(int candidatoDivisor = 2; candidatoDivisor < numero && primo == true; candidatoDivisor++)
		{
			resto = numero % candidatoDivisor;
			
			if(resto==0)
			{
				primo = false;
			}
		}

		
		mensaje = (primo)?"Es primo":"No es primo";
		System.out.println(mensaje);
	}

}
