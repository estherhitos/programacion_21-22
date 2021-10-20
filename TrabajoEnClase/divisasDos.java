/*
 * divisasDos.java
 * 
 * Realice un programa que convierta a 5 divisas una cantidad dada:

euro = 1,00
dolar = 1,1628
libra = 0,8428
yen = 133,0100
yuan = 7,4311
* 
* Converion siempre a euro todas las monedas.
*final = indica una constante
* 
Busque los factores de conversión en internet.

El programa solicitará al usuario la divisa de entrada, así como la cantidad de dinero en dicha
divisa.

Una vez realice los cálculos oportunos, el programa mostrará la equivalencia de la cantidad de
dinero introducida en las 5 divisas indicadas.

 * 
 * @Autora: Esther Hitos Garcia
 */


public class divisasDos {
	
	public static void main (String[] args) {
		double euro =0;
		double dolar =0;
		double libra =0;
		double yen =0;
		double yuan =0;
		
		
		final double euroDolar = 1.16;
		final double euroLibra = 0.84;
		final double euroYen = 133.05;
		final double euroYuan = 7.43;
		
		System.out.println("Conversor de 5 Divisas");
		System.out.println("euro");
		System.out.println("dolar");
		System.out.println("libra");
		System.out.println("yen");
		System.out.println("yuan");
		System.out.println("Elige la moneda con la que quieres empezar");
		String tipoMoneda = System.console().readLine();
		
		System.out.println("Introduce la cantidad de dinero que quieres convertir");
		euro = Double.parseDouble(System.console().readLine());
		
		tipoMoneda.toLowerCase(); // convierto a minúsculas
		
		switch (tipoMoneda){

			case "dolar":
			euro =euroDolar;
			
			case "libra":
			euro =euroLibra;
			
			case "yen":
			euro =euroYen;
			
			case "yuan":
			euro =euroYuan;
			 
			break;
			default:
			}
			dolar = euro * euroDolar;
			libra = euro * euroLibra;
			yen = euro * euroYen;
			yuan = euro * euroYuan;
			
			System.out.println("la cantidad de dinero es en euros "+euro);
			System.out.printf("la cantidad de dinero introducido es en dolar %.2f \n",dolar);
			System.out.printf("la cantidad de dinero introducido es en Libra %.2f \n",libra);
			System.out.printf("la cantidad de dinero introducido es en Yen %.2f \n",yen);
			System.out.printf("la cantidad de dinero introducido es en Yuan %.2f \n",yuan);
			
	}
}

