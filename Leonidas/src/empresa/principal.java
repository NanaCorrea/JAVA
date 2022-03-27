package empresa;

import java.util.Scanner; //ctrl shif o - faz importação

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu palpite");
		int palpite = teclado.nextInt();
		String msg;
		while(palpite != 10000) {
			msg = palpite<10000?"Um pouco mais...":"Um pouco menos...";
			System.out.println(msg);
//			if(palpite < 10000) {
//				System.out.println("Um pouco mais...");
//			}
//			else {
//				System.out.println("Um pouco menos...");
//			}
			System.out.println("Digite seu próximo palpite");
			palpite = teclado.nextInt();
		}
		System.out.println("Você acertou!");
	}

}
