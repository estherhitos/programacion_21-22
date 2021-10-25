/*
 * Ejercico 10 | Tema 5.java
 * 
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. El usuario ha de indicar cuantos números va a introducir.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		double Num = 0;
		double notas = 1;
		double media;
		double resultado =0;
		System.out.println("Introduce la cantidad total de numeros");
		Num = Integer.parseInt(System.console().readLine());
		
		for ( int i=0;i<Num;i++){
			System.out.printf ("introduzca las notas");
			notas = Double.parseDouble(System.console().readLine());
			resultado = notas + resultado;
			 //double resultado += notas; 
			
			}
			media = resultado/Num;
		System.out.printf("La media de las notas introducidas es %.2f",media);
		
	}
}

