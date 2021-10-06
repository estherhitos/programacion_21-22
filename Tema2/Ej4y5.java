/*
 * Ej4y5.java
 * 
 * Realiza un conversor de pesetas a euros. 
 * La cantidad en pesetas que se quiere convertir 
 * deberá estar almacenada en una variable.
 * 
 * Authora:Esther hitos Garcia
 */


public class Ej4y5 {
	
	public static void main (String[] args) {
		double euros = (float)2.00;
    int pesetas = (int)(euros*166.386);
    
    int peseticas = 1000;
    double euritos = ((peseticas)*0.006);
    
    System.out.printf("%d pesetas son %.2f euros.\n", peseticas,euritos);
    
    System.out.printf("%.2f euros son %d pts.\n", euros, pesetas);
	}
}

