package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		// Mostrar las 10 primeras tablas de multiplicar y la suma de ellas.
		
		// TABLA DEL 1:
		// 1 x 1  = 1
		// 1 x 2  = 2
		// 1 x 3  = 3
		//   ...
		// 1 x 10 = 10
		// ===========
		// La suma vale X
		
		// TABLA DEL 2:
		// 2 x 1  = 1
		// 2 x 2  = 4
		// 2 x 3  = 6
		//   ...
		// 2 x 10 = 20
		// ===========
		// La suma vale X
		
		int resultado;
		int suma;
		String fila;
		
		for(int numero=1; numero<=10; numero++)
		{
			System.out.println("\nTabla del " + numero + ":");
			suma = 0;
			for(int j=1; j<=10; j++)
			{
				resultado = numero * j;
				suma = suma + resultado;
				fila = numero + "   x   " + j + "   =   " + resultado;
				System.out.println(fila);
			}
			
			System.out.println("La suma de la tabla del " + numero + " es " + suma + ".");
		}
	}
}
