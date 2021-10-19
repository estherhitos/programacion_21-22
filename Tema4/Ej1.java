/*
 * Ej1Tema4.java
 * 
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej1 {
	
	public static void main (String[] args) {
		
	
		
		
		System.out.println("Que asignatura toca a primera hora hoy?");
		System.out.println("Dime que dia es hoy plis (todo en minuscula): ");
		String diaSemana = System.console().readLine();
		
		diaSemana.toLowerCase(); // convierto a minúsculas
		
		switch (diaSemana){
			case "lunes":
			System.out.println( "Lenguaje de Marcas");
			break;
			
			case "martes":
			System.out.println("Entorno de Desarrollo");
			break;
			
			case "miercoles":
			System.out.println("Lenguaje de Marcas");
			break;
			
			case "jueves":
			System.out.println("Entorno de Desarrollo");
			break;
			
			case "viernes":
			System.out.println("Formacion y Orientación Laboral");
			break;
			
				default:
					System.out.println("El dia introducido no hay clase.");
			}
	}
}

