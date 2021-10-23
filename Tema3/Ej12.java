/*
 * Ejercicio 12 | Tema3 .java
 * 
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
* 
 * nota1 = ((nota1 * 40) + (nota2 * 60)) / 100;//lo que tienes de nota
 * 																							si se supiese la nota del segundo examen
 * 
 * mediaDeseada = ((nota2*100)-(nota1*40))/60;//lo que te falta para la nota deseada
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej12 {
	
	public static void main (String[] args) {
	
		
		
		System.out.println("Introduce la nota de primer examen: ");
		float nota1 = Float.parseFloat(System.console().readLine());
		
		System.out.println("Introduce la nota media deseada el curso: ");
		float nota2 = Float.parseFloat(System.console().readLine());
		
		
		float media = ((nota2*100)-(nota1*40))/60;
		
		System.out.printf("La nota que necesitas sacar es de %.2f ",media);
		
	}
}

