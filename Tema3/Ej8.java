/*
 * Ejercicio8 | Tema3.java
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		double horaTrabajada= 0;
		double pagoHora = 12;
	
		
		System.out.println("Calculo de Salario Semanal");
		System.out.println("Porfabor introduce las horas que as realizado esta semana: ");
		horaTrabajada = Double.parseDouble(System.console().readLine());
	
		System.out.printf ("Esta semana trabajaste %.2f horas \n", horaTrabajada);
		
		double salario = horaTrabajada*pagoHora;
		
		System.out.printf ("El salario que cobraras esta semana sera de:  %.2f" ,salario);
		
	}
}

