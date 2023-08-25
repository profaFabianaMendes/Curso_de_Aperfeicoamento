package dados;

import negocio.*;

public class Dados {
	private Aluno[] alunos;
	private int nAlunos = 0;
	private Professor[] professores ;
	private int nProfs = 0;
	private Curso[] cursos;
	private int nCursos = 0;
	private Matricula[] matriculas;
	private int nMatriculas = 0;
	
	public Dados() {
		alunos = new Aluno[100];
		professores = new Professor[50];
		cursos = new Curso[50];
	}
	
	
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public Aluno getAluno(int i) {
		return alunos[i];
	}

	public String[] getNomeAlunos() {
		String[] s = new String[nAlunos];
		for(int i = 0; i < nAlunos; i++) {
			s[i] = alunos[i].getNome();
		}
		return s;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void setAluno(int i, Aluno a) {
		alunos[i] = a;
	}

	public int getnAlunos() {
		return nAlunos;
	}

	public void setnAlunos(int nAlunos) {
		this.nAlunos = nAlunos;
	}

	public Professor[] getProfessores() {
		return professores;
	}
	
	public Professor getProfessor(int i) {
		return professores[i];
	}

	public String[] getNomeProfessores() {
		String[] s = new String[nProfs];
		for(int i = 0; i < nProfs; i++) {
			s[i] = professores[i].getNome();
		}
		return s;
	}


	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	
	public void setProfessor(int i, Professor p) {
		professores[i] = p;
	}

	public int getnProfs() {
		return nProfs;
	}



	public void setnProfs(int nProfs) {
		this.nProfs = nProfs;
	}

	public Curso[] getCursos() {
		return cursos;
	}
	
	public Curso getCurso(int i) {
		return cursos[i];
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	
	public void setCurso(int i, Curso c) {
		cursos[i] = c;
	}
	
	public int getnCursos() {
		return nCursos;
	}

	public void setnCursos(int nCursos) {
		this.nCursos = nCursos;
	}

	public Matricula[] getMatriculas() {
		return matriculas;
	}
	
	public Matricula getMatricula(int i) {
		return matriculas[i];
	}

	public void setMatriculas(Matricula[] matriculas) {
		this.matriculas = matriculas;
	}
	
	public void setMatricula(int i, Matricula m) {
		matriculas[i] = m;
	}



	public int getnMatriculas() {
		return nMatriculas;
	}



	public void setnMatriculas(int nMatriculas) {
		this.nMatriculas = nMatriculas;
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
		nAlunos = nProfs = nCursos = 10;
	}

}
