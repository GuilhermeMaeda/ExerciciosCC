package Main;

import java.util.Scanner;

public class ListaPalavra{

	public static void main(String[] args) {
           Scanner teclado = new Scanner (System.in);		 

           System.out.println("Type a word here");
           String palavra = teclado.next();
           teclado.close();
           
           logicList(palavra);
	}
	
	static void logicList(String palavra){
           
		String letter [] = palavra.split("");
           
           Lista head = new Lista(); 
           Lista list = new Lista();
           
           list.word = letter [0]; 
           head = list;
           list.previous = null;
           
           for (int a = 1; a < letter.length; a++) { 
        	    			 
        	    			Lista preenche = new Lista(); 
        	    			preenche.word = letter[a]; 
        	    			 
        	    			head.next = preenche; 
        	    			preenche.previous = head; 
        	    			head = preenche; 
        	    		}
           
           do{
        	   System.out.println(head.word);
        	   head = head.previous;
           } while (head!= null);
           System.out.println("A palavra escrita do fim ao começo fica assim, That's all folks!");
	}
}
