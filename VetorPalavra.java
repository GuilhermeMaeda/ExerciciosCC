package Main;

import java.util.Scanner;

public class VetorPalavra {
    
	static Scanner teclado = new Scanner (System.in);
	
	public static void main (String [] args){
        	
        	System.out.println("Escribe una palabra");
        	String palabra = teclado.next();
        	
        	inverter(palabra);
        }
        
        static void inverter (String word){
        	
        	String palavra [] = word.split("");
        	
        	for (int a = palavra.length-1; a>=0;a--){
        		System.out.println(palavra[a]);
        	}
        	System.out.println("A palavra foi escrita do fim para o começo");
        	teclado.close();
        }
}
