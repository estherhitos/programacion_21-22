/*
 * Ej2|tema3.java
 * 
 * Realiza un conversor de euros a pesetas. 
 * La cantidad de euros que se quiere convertir 
 * debe ser introducida por teclado
 * 
 * 
 */


public class Ej2 {
	
	public static void main (String[] args) {
    
    double peseta = 166.386;
    
    System.out.println("Conversor de euros a pesetas");
    System.out.print("Porfabor Introduzca la cantidad en €: ");
    float euros = Float.parseFloat(System.console().readLine());
    double total = (float)euros*peseta;
    System.out.printf("%.2f € son %.2f pesetas.",euros, total);
    
    
	}
}

