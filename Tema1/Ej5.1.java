

public class Ej5.1{
  public static void main (String[] args){
    
    String r= "\033[31m";//amarillo/rojo
    String v = "\u001B[32m";//verde
    String m = "\033[33m";//amarillo
    String z = "\u001B[34m";//azul
    String p = "\u001B[35m";//purpura
    String c ="\033[36m";//cyan 
    String w ="\033[37m";//white
    
    
  System.out.println("___________________________________________________________");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-3s\n","|lunes","|martes","|miercoles","|jueves","|viernes","|");
		System.out.println("___________________________________________________________");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-4s\n","|PRO","|SINF","|PRO","|PRO","|SINF","|");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-4s\n","|PRO","|SINF","|PRO","|PRO","|SINF","|");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-4s\n","|BBDD","|SINF","|BBDD","|PRO","|SINF","|");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-3s\n","|BBDD","|PRO","|ED","|BBDD","|FOL","|");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-3s\n","|LM","|LM","|ED","|BBDD","|FOL","|");
		System.out.printf("%-10s %-10s %-13s %-10s %-10s %-3s\n","|LM","|LM","|ED","|BBDD","|FOL","|");
  
  }
}
