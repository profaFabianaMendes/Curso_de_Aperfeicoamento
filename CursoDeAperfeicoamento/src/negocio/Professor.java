package negocio;

public class Professor extends Pessoa {
	private double valorHoraAula;
	
	public Professor(String n,  String id,  String cpf, String tel,  double v) {
		nome = n;
		numID = id;
		this.cpf = cpf; 
		numTel = tel;
		valorHoraAula = v;	
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
