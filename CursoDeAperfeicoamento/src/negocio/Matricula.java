package negocio;

public class Matricula {
	
	private Aluno aluno;
	private String data;
	private double valorPago;
	private String turma;
	
	
	public Matricula(Aluno a, String d, double v, String t) {
		aluno = a; 
		data = d;
		valorPago = v;
		turma = t;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public double getValorPago() {
		return valorPago;
	}


	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String toString() {
		return "Matricula do aluno " + aluno + ", o valorPago foi de R$ " + valorPago;
	}

	
}
