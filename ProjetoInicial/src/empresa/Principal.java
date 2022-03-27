package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade=10;
		float peso;
		String nome = "Mariana";
		int tamanho = nome.length();
		nome = "Super " + nome;
		System.out.println();
		System.out.println("Hello World!");
		System.out.println("Ln vem de linha, imprime em linhas diferentes");
		System.out.print("Sem o ln imprimi");
		System.out.print(" tudo na mesma linha.");
		System.out.println("Idade: " + idade);
//		if(condicao) {
//			//codigo
//		}
		for(int i=0; i<10; i++) {
			System.out.println("O if e o for são iguais ao JS " + i);
		}
		
		int[] megasena = {11,34,13,55,78};
		
		int[] megasena2 = new int[6]; //deixa espaço armazenado na memória para armazenar 6 inteiros
		
		System.out.println("Digite a sua idade");
		
		Scanner teclado = new Scanner(System.in); //o Scanner precisa ser importado, um jeito fácil é clicar no erro que terá a opção de importar
		
		idade = teclado.nextInt();
		
		System.out.println(idade);
	}

}
