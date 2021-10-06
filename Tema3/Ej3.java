/*
 * Ej3|tema3.java
 * 
 * Realiza un conversor de pesetas a euros. 
 * La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * 
 */


public class Ej3 {
	
	public static void main (String[] args) {
		
    double euros = 0.006;
    
    System.out.println("Conversor de pesetas a euros");
    System.out.print("Porfabor Introduzca la cantidad en pesetas: ");
    float peseta = Float.parseFloat(System.console().readLine());
    
    double total = (float)euros * (float)peseta;
    System.out.printf("%.2f pesetas son %.2f €.",peseta, total);
    
	}
}

