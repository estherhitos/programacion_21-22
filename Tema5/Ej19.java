/*
 * Ejercicio 19 | Tema 5.java
 * 

Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 * 
 */


public class Ej19 {
	
	public static void main (String[] args) {
		
		int altura;
		
		int suma=0;
		
		
		System.out.println("Que altura quieres en mumero entero porfabor: ");
		altura = Integer.parseInt(System.console().readLine());
		
		System.out.println("Dime el caracter con lo que quieres pintar la piramide");
		String caracter = System.console().readLine();
		
		int contador = 2*altura-1;
		
		for (int i=0;i<altura;i++) {
			for ( int j=0;j<=i;j++) {
			System.out.print(" ");
			//resta -=caracter;
		}
				for ( int x=0;x<contador;x++) {
				System.out.print(caracter);
				
				}
		System.out.println();
		contador = contador-2;
	}
	
	//piramide hacia arriba
	
	 contador =1;
	for (int i=altura-1;i>=0;i--) {
			for ( int j=0;j<i;j++) {
			System.out.print(" ");
			//resta -=caracter;
		}
				for ( int x=0;x<contador;x++) {
				System.out.print(caracter);
				
				}
		System.out.println();//retorno de carro
		contador = contador+2;
	}
	//piramide hueca
	contador =1;
	for (int i=altura-1;i>=0;i--) {
			for ( int j=0;j<i;j++) {
			System.out.print(" ");
			//resta -=caracter;
		}
				for ( int x=0;x<contador;x++) {
					if ((j==0) || (j==contador -1) || (i==0))//pinta la ultima linea porque el contador llega al 0 (i==0)
				System.out.print(caracter);
				
				}
		System.out.println();
		contador = contador+2;
	}
	
	
	
	
	
	}
}

