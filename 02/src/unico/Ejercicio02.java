package unico;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		int suma = 0;
		double media = 0.0;
		int contador = 0;
		int mayorEdad = 0;
		
		System.out.println("Cálculos estadísticos del alumnado:");
		System.out.print("Introduce la edad del alumnado [Negativo para salir]: ");
		edad = Integer.parseInt(teclado.nextLine());
		
		while (edad > 0) {
			suma += edad;
			contador ++;
			media = (double) suma/contador;
			if (edad >= 18) {
				mayorEdad ++;
			}
			System.out.println("Introduce la edad del alumnado: ");
			edad = Integer.parseInt(teclado.nextLine());
		}	

		System.out.println("La suma de edades: " + suma);
		System.out.println("La media de edades: " + media);
		System.out.println("El número de alumnos intoducidos: " + contador);
		System.out.println("El número de alumnos mayores de edad: " + mayorEdad);
	}
}