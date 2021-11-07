/*
 * Ej15Potencia.java
 * 
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar .
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 * 
 */


public class Ej15Potencia {
	
	public static void main (String[] args) {
		
				double base;
        int exp;
       
        System.out.println("introduce el numero de la base plis: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("introduce el numero del exponente plis: ");
        exp = Integer.parseInt(System.console().readLine());

				double result;
				int exponente;
        
				for (int i = 1; i <= exp; i++) {
        
					result = 1;
					exponente = i;
      
				for (int j = 0; j < exponente; j++) {
        result *= base;
				}
      
					System.out.println(base + "^" + i + " = " + result);
				}
    }
}
		
	


