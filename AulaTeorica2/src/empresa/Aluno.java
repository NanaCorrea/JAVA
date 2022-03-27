package empresa;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	
	Aluno(){
		System.out.println("Aluno criado sem parâmetros");
	}
	
	Aluno(int matricula, String nome, String cpf) {
		this.matricula = matricula; //como o parâmetro e os atributos tem o mesmo nome, utilizo o this para fazer referência a classe
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Aluno(int matricula) {
		this.matricula = matricula;
		this.nome = "Vazio"; // Caso seja criado um aluno usando só a mtrícula, já fica com valores padrão de nome e cpf
		this.cpf = "77777777777";
	} //Construtor gerado pelo próprio Eclipse clicando em Source => Generate Constructor using Fields

	void info() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
}
