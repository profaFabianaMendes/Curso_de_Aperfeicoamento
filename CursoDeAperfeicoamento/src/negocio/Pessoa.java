package negocio;

public abstract class Pessoa {
	protected String nome;
	protected String numID;
	protected String cpf; 
	protected String numTel;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumID() {
		return numID;
	}


	public void setNumID(String numID) {
		this.numID = numID;
	}


	public String getCPF() {
		return cpf;
	}


	public void setCPF(String cPF) {
		cpf = cPF;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public String toString() {
		return "to do";
	}

}
