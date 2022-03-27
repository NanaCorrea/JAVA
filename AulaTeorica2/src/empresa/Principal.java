package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
//		System.out.println("Lista de alunos");
//		Aluno a = new Aluno();
//		a.matricula = 1001;
//		a.nome = "Mariana";
//		a.cpf = "11111111111";
//		
//		Aluno b = new Aluno();
//		b.matricula = 1002;
//		b.nome = "Sandy";
//		b.cpf = "22222222222";
//				
//		a.info();
//		b.info();
		
		Carro c = new Carro();
		
//		Carro.PI = 70; a partir dessa linha o valor de PI seria 70
		System.out.println(Carro.milhasParaMetros(10));
		
		Turma nova = new Turma();
		nova.prof = new Professor();
		nova.prof.nome = "Lucas";
		nova.alunos = new ArrayList<Aluno>();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="Junior";
		
		Aluno d = new Aluno(1003, "Monica", "44444444444"); //Criação de aluno com Construtor
		Aluno e = new Aluno(1004, "dfdsfgsd", "55555555555");
		d.info();
		e.info();
		Aluno f = new Aluno(1005);
		f.info();
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(d);
		alunos.add(new Aluno(1006, "Theo", "88888888888"));
	}

}
