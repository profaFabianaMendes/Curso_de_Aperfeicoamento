package negocio;

public class Aluno extends Pessoa { 
	private String dataNasc;
	private String endereco;
	
	public Aluno(String n, String e) {
		nome = n;
		endereco = e;
	}


	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {	
		return "Nome do aluno: " + nome;
	}
	

}
