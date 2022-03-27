package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		int megasena[] = {10,20,30,40,50,55}; método antigo
		//int não é uma classe, é um primitivo
//		ArrayList<Integer> megasena = new ArrayList(); //o integer é a classe que representa o int
//		megasena.add(10);
//		megasena.add(20);
//		megasena.remove(0); //remove o índice indicado
		
		ArrayList<String> nomes = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		String msg;
		System.out.println("Digite quantos nomes irá inserir");
		int total = teclado.nextInt();
		System.out.println("Digite os nomes:");
		for(int i=0; i<total; i++) {
			msg = teclado.next();
			nomes.add(msg);
		}
		
		System.out.println("Ordem normal");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Ordem reversa");
//		for(int i = total -1; i >= 0; i--) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.reverse(nomes);
		System.out.println(nomes);
	}

}
