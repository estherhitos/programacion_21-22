/*
 * Ejercicio 12 | Tema 5.java
 * 
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
* 
* 
* Tenemos 3 variables:

num1: el primer valor, que iremos después actualizando con el siguiente (como si avanzara). Se inicia en 0.
num2: el segundo valor, que se actualizara con la suma del mismo y el primer valor. Se inicia en 1.
suma: la suma de los dos valores. Empieza en 1.
serie: hasta donde queremos que llegue para hacerlo finito. En mi caso, lo pondré a 10.
 * 
 * a=i++; 1º se asigna, despues aumenta i.
 * 
 * a=++i; 1º aumenta i, despues se asigna.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej12 {
	
	public static void main (String[] args) {
		
		int num1=0, num2=1, suma=1;
		int serie;
		
		System.out.print("Introduce un numero y te calculo el Fibonacci: ");
		serie= Integer.parseInt(System.console().readLine());
		
		       // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
             
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
             
             
        }
		
		
		
	}
}

