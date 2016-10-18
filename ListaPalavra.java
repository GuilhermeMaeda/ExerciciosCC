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
           
           Lista head = new Lista(); //Criado para indicar a letra que está no começo da lista
           Lista list = new Lista(); // Criação da lista
           
           list.word = letter [0]; // Indica que o valor na lista é igual a letra na posição 0
           head = list; // A cabeça da lista vai ser igual ao valor na posicao 
           list.previous = null; //Como a letra é a primeira na lista, não tem ninguém antes dela
           
           for (int a = 1; a < letter.length; a++) { 
        	    			 
        	    			Lista preenche = new Lista(); 
        	    			preenche.word = letter[a];// As letras são populadas na lista 
        	    			 
        	    			head.next = preenche; // Indica qual é a letra depois da Head 
        	    			preenche.previous = head; //Indica que a letra anterior é a que está na head 
        	    			head = preenche; 
        	    		}
           
           do{
        	   System.out.println(head.word);
        	   head = head.previous;
           } while (head!= null);
           System.out.println("A palavra escrita do fim ao começo fica assim, That's all folks!");
	}
}
