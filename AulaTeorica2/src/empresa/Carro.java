package empresa;

public class Carro {
	String nome;
	String modelo;
	float velocidade;
	
	static final double PI = 3.1415; // com o final o valor não pode ser alterado
	
	static float milhasParaMetros(float milhas) {
		return milhas*1600;
	}
}
