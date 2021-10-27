/*
 * ejercicio1 | Tema 5 .java
 * 
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for,
* pidiendo al usuario que multiplo quiere y hasta que rango quiere llegar.
 * 
 * <= menor o igual que
 */

import java.util.Scanner;
public class Ej1V1 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			int n; // Cuenta
			int x; // Múltiplo
			int i; // Contador

			System.out.print("¿De qué número quieres los múltiplos?: ");
			x = sc.nextInt();

			System.out.print("¿Hasta qué número quieres la lista?: ");
			n = sc.nextInt();

				for (i=1; i <=n; i++) {

					if (i % x == 0)
						System.out.println(i);

				}
	}
}
