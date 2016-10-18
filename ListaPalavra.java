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
           
           Lista head = new Lista(); //Criado para indicar a letra que est� no come�o da lista
           Lista list = new Lista(); // Cria��o da lista
           
           list.word = letter [0]; // Indica que o valor na lista � igual a letra na posi��o 0
           head = list; // A cabe�a da lista vai ser igual ao valor na posicao 
           list.previous = null; //Como a letra � a primeira na lista, n�o tem ningu�m antes dela
           
           for (int a = 1; a < letter.length; a++) { 
        	    			 
        	    			Lista preenche = new Lista(); 
        	    			preenche.word = letter[a];// As letras s�o populadas na lista 
        	    			 
        	    			head.next = preenche; // Indica qual � a letra depois da Head 
        	    			preenche.previous = head; //Indica que a letra anterior � a que est� na head 
        	    			head = preenche; 
        	    		}
           
           do{
        	   System.out.println(head.word);
        	   head = head.previous;
           } while (head!= null);
           System.out.println("A palavra escrita do fim ao come�o fica assim, That's all folks!");
	}
}
