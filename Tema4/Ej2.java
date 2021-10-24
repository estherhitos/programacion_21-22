/*
 * Ejercicio 2 | Tema 4.java
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej2 {
	
	public static void main (String[] args) {
		
		float hora;
		
		
		System.out.println("Porfabor introduzca la hora sin minutos: ");
		hora = Integer.parseInt(System.console().readLine());
		
		if ((hora>=6)&&(hora<=12)){
			System.out.println("Buenos Dias");
		}else
		
				if ((hora>=13)&&(hora<=20)){
					System.out.println("Buenas Tardes");
				}else
			
					if ((hora>=21)&&(hora<=5)){
						System.out.println("Buenas Noches");
					}else{
	
				System.out.println("La hora introducida no es correcta");	
			}
	}
}

