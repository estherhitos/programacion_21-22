/*
 * Ejercicio 21 | Tema 4.java
 * 
Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej21 {
	
	public static void main (String[] args) {
		
		float nota1;
		float nota2;
		
		System.out.println("Quieres saber si has aprobado programación??");
		
		System.out.println("Introduce la nota del 1º examen del trimestre: ");
		nota1=Float.parseFloat(System.console().readLine());
		
		System.out.println("Introduce la nota del 2º examen del trimestre: ");
		nota2=Float.parseFloat(System.console().readLine());
		
		float media=(nota1+nota2)/2;
		
		
		if (media>=5){
			System.out.printf("Tu nota es %.2f. Estas aprobado!!",media);
			}else{
			 
			float recu=media;
			if (media<5){
				System.out.printf("Tu nota es %.2f. NO estas aprobado!!\n",media);
				}
				System.out.println("Cuál ha sido el resultado de la recuperación?");
				recu=Float.parseFloat(System.console().readLine());
				 if (recu >=5){
					System.out.printf("El resultado de tu recuperación es un %.2f: apto!!",recu);
					}else if(recu <5){
						System.out.printf("El resultado de tu recuperación es un  %.2f: NO apto!!",recu);
						}
				}	

				
				
				
				
				
	}	
}


