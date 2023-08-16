package negocio;

public class Professor extends Pessoa {
	private double valorHoraAula;
	
	public Professor(String n, double v, String t) {
		nome = n;
		valorHoraAula = v;
		numTel = t;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	public String toString() {
		return "Nome do professor: " + nome + ", valor da hora/aula: R$" + valorHoraAula;
	}

	
}