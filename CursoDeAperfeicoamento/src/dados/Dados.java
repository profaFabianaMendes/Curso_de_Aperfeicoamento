package dados;

import negocio.*;

public class Dados {
	Aluno[] alunos;
	Professor[] professores ;
	Curso[] cursos;
	Matricula[] matriculas;
	
	public Dados() {
		
		alunos = new Aluno[100];
		professores = new Professor[50];
		cursos = new Curso[50];
		matriculas = new Matricula[500];
		
	}
	
	public void preencherDados() {
		// TO DO
	}

}
