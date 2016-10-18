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
	        	
	        	String aux [] = new String [palavra.length];
	        	
	        	
				for (int a = palavra.length -1, b=0; a >= 0 && b<palavra.length; a--,b++){
					 aux[b] = palavra[a];
				}
				for (int c = 0; c<aux.length;c++){
	        		System.out.println(aux[c]);
	        	}
	        	System.out.println("A palavra foi escrita do fim para o começo");
	        	teclado.close();
	        }
	}


