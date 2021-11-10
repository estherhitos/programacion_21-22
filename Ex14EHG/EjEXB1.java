/*
 * EjEXB1.java
 * 
Implemente un programa que calcule el número de latidos del corazón de una persona durante el
transcurso de varios años. Al usuario se le solicitará interactivamente el tiempo transcurrido, expresado en
años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por minuto. No es necesario
considerar los años bisiestos, se considera que todos los años tienen 365 días.
 * 
 *  * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class EjEXB1 {
	
	public static void main (String[] args) {
		
		int latmin;
		int anos;
		long latidosTotales;
		
		System.out.print("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
		latmin= Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca el tiempo en años:");
		anos= Integer.parseInt(System.console().readLine());
		
		latidosTotales = (long)anos * 365 * 24 * 60 * latmin;
		
		System.out.println("En ese tiempo, su corazón habrá latido "+latidosTotales+" veces.");
		
	}
}

