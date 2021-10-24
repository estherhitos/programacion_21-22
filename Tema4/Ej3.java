/*
 * Ejercicio 3 | Tema 4.java
 * 
 * Escribe un programa en que dado un número del 1 a 7 
 * escriba el correspondiente nombre del día de la semana.
 *
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej3 {
	
	public static void main (String[] args) {
		
		int dia;
		
		System.out.println("Quieres saber que dia es en Ingles?");
		System.out.println("Dime del 1 al 7 que Dia quieres");
		dia = Integer.parseInt(System.console().readLine());
		
		switch (dia){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.print("El numero introducido no existe en los dias de la semana");
			}
		
	}
}

