/*
 * Ej9CuentaDigitos.java | Tema5 
 * 
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice ( int o long ).
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia  
 */


public class Ej9CuentaDigitos {
	
	public static void main (String[] args) {
		
		int c=1;
		int n;
		
		System.out.println("programa que nos dice cuántos dígitos tiene uel número introducido.");
		System.out.println("Introduce una secuencia de numeros: ");
		int numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		
		n = numeroIntroducido;//pongo una auxiliar para no perder el valor de la variable numeroIntroducido
		
		while (n>10){//si numero introducido es mayor que 10
			n= n/10;//dividemelo entre 10 y me va decapando el numero
			c++;// si no puedo seguir dividiendo por 10 sacame el resultado y si no dame otra vuelta
		}
			
		System.out.println("En numero "+numeroIntroducido+" tiene "+c+" digitos");
	}
}

