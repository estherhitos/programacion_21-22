/*
 * Ejemploif.java
 * 
 * Copyright 2021 usuario <usuario@debian9>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Ejemploif {
	
	public static void main (String[] args) {
		int n;
    int resto;
    
    System.out.println("Introduzca un entero: ");
    n = Integer.parseInt(System.console().readLine());
    
    resto = n%2;
    
    if(resto == 0){
      System.out.print("El numero introduzido es par.");
      }else{
        System.out.print("El numero introduzido es inpar.");
        }
	}
}

