package dados;

import negocio.*;

public class Dados {
	Aluno[] alunos;
	int nAlunos = 0;
	Professor[] professores ;
	int nProfs = 0;
	Curso[] cursos;
	int nCursos = 0;
	Matricula[] matriculas;
	int nMatriculas = 0;
	
	public Dados() {
		
		alunos = new Aluno[100];
		professores = new Professor[50];
		cursos = new Curso[50];
		preencherDados();
		
	}
	
	
	
	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			alunos[i] = new Aluno("Aluno".concat(s), "id".concat(s), "cpf".concat(s), 
					"telefone".concat(s), "dataNascimento".concat(s), "endereco".concat(s));
			professores[i] = new Professor("Professor".concat(s), "id".concat(s), "cpf".concat(s), 
					"telefone".concat(s), i);
			cursos[i] = new Curso("Curso".concat(s), "Conteudo".concat(s), i, professores[i]);
			cursos[i].matricular(new Matricula(alunos[i], "hoje", i, "turma".concat(s) ));			
		}
		nAlunos = nProfs = nCursos;
	}

}
