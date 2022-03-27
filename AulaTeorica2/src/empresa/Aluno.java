package empresa;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	
	Aluno(){
		System.out.println("Aluno criado sem par�metros");
	}
	
	Aluno(int matricula, String nome, String cpf) {
		this.matricula = matricula; //como o par�metro e os atributos tem o mesmo nome, utilizo o this para fazer refer�ncia a classe
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Aluno(int matricula) {
		this.matricula = matricula;
		this.nome = "Vazio"; // Caso seja criado um aluno usando s� a mtr�cula, j� fica com valores padr�o de nome e cpf
		this.cpf = "77777777777";
	} //Construtor gerado pelo pr�prio Eclipse clicando em Source => Generate Constructor using Fields

	void info() {
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
}
