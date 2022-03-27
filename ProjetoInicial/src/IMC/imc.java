package IMC;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		System.out.println("Por favor, digite o seu peso (kg)");
		Scanner teclado = new Scanner(System.in);
		float peso = teclado.nextFloat();
		System.out.println("Digite sua altura (metros)");
		float altura = teclado.nextFloat();
		float imc = peso / (altura*altura); //peso / Math.pow(altura, 2) também calcula o quadrado
		System.out.printf("Seu imc é: %.2f ", imc); //reduzir a duas casas decimais
	}

}
