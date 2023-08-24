package negocio;

public class Aluno extends Pessoa { 
	private String dataNasc;
	private String endereco;
	
	public Aluno(String n, String id,  String cpf, String tel, String dt, String e) {
		
		nome = n;
		numID = id;
		this.cpf = cpf; 
		numTel = tel;
		dataNasc = dt;
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
