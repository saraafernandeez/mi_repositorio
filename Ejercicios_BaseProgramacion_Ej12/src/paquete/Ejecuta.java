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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		for(int candidatoDivisor = 2; candidatoDivisor < numero && primo == true; candidatoDivisor++)
		{
			resto = numero%candidatoDivisor;
			if(resto==0)
			{
				primo = false;
			}
		}
		
		if(primo==true)
		{
			System.out.println("El número " + numero + " es primo.");
		}
		else
		{
			System.out.println("El número " + numero + " no es primo.");
		}
	}

}
