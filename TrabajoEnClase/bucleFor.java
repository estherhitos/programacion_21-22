/*
 * bucleFor.java
 * 
for (expresion1 ; expresion2 ; expresion3) {
sentencias
}
Justo al principio se ejecuta expresion1 y normalmente se usa para inicializar una
variable. El bucle se repite mientras se cumple expresion2 y en cada iteración del bucle
se ejecuta expresion3 , que suele ser el incremento o decremento de una variable. Con
un ejemplo se verá mucho más claro.
 * 
 */


public class bucleFor {
	
	public static void main (String[] args) {
		for (int i=1;i<=10;i++)//doy 10 vueltas porque tengo el = 
		System.out.print("hola");
		
		for (int i=1;i<10;i++)//doy 9 vueltas porque no tengo el igual 
		System.out.print("hola");
		
		for (int i=0;i<10;i++)//doy 10 vueltas porque la variable i inicia en 0
		System.out.print("hola");
		
		for (int i=1;i<10;i++)
		System.out.print("hola"(i+1);//doy 10 vueltas porque incremento la salida en 1 mas
		
		for (int i=5;i>=1;i--)//resta de uno en uno hasta el 5
		System.out.print("hola"+(i+1);
		
		for (int i=5;i>=1;i--)//resta de uno en uno hasta el 5
		System.out.print("hola"+(5-i+1);//en este caso la variable centinela cuenta hacia atras
																		//pero en pantalla el conteo se obtiene hacia adelante
																		
		for (int i=5;i<=1;i++)//no tiene fin y rebienta
		System.out.print("hola"(i+1);
		
		
	}
}

