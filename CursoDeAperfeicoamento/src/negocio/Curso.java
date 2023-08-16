package negocio;

public class Curso {
	
	private String nome;
	private String dtInicio;
	private String dtTermino;
	private int horaInicio;
	private int horaTermino;
	private int cargaHoraria;
	private String conteudoProg;
	private Professor prof;
	private double valor;
	private Matricula[] alunosMatriculados = new Matricula[40];
	private int numAlunos = 0;
	
	public Curso(String n, String cont, double val, int total) {
		nome = n;
		conteudoProg = cont;
		valor = val;
		numAlunos = total;
	}

	public Matricula[] getMatriculas() {
		return this.alunosMatriculados;
	}
	
	public void setArrayAlunosMatriculados(Matricula[] a) {
		this.alunosMatriculados = a;
	}

	public Aluno getAluno(int i) {
		return alunosMatriculados[i].getAluno();
	}

	public void setAluno(Matricula alunoMat, int i) {
		this.alunosMatriculados[i] = alunoMat;
	}

	public int getNumAlunos() {
		return numAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getConteudoProg() {
		return conteudoProg;
	}

	public void setConteudoProg(String conetudoProg) {
		this.conteudoProg = conetudoProg;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Nome do curso: " + nome + ", valor do Curso:" + valor;
	}
	
	public String listarAlunosMatriculados() {
		String saida = "***** Lista de Alunos Matriculados ***** \n" ;
		for(int i = 0; i < numAlunos; i++) {
			System.out.println(i);
			saida = saida + "\n"+ alunosMatriculados[i].getAluno().toString();
		}
		return saida;
	}	
}