/*
 * claseExponente.java
 * 
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base sucesivas al numero dado y exponentes entre
uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo,
si introducimos el 2 y el 5, se deberán mostrar 2^1 , 3^2 , 4^3 , 5^4 y 6^5 
 * 
 * 
 */


public class exponente {
	
	public static void main (String[] args) {
		
		double base;
		int exp;
		double resul=1;
		
		System.out.println("introduzca la base: ");
		base = Double.parseDouble(System.console().readLine());
		
		System.out.println("introduzca el exponente: ");
		exp = Integer.parseInt(System.console().readLine());
		
		for ( int i=1; i<exp;i++, base++){
			resul=1; 
			for (int j=0; j<i;j++){
				resul= base * resul;
				}
				System.out.printf("%.2f ^ %d = %.2f \n",base, i, resul);
		}		
	}
}

