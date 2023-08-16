package negocio;

public abstract class Pessoa {
	protected String nome;
	protected int numID;
	protected int CPF; 
	protected String numTel;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumID() {
		return numID;
	}


	public void setNumID(int numID) {
		this.numID = numID;
	}


	public int getCPF() {
		return CPF;
	}


	public void setCPF(int cPF) {
		CPF = cPF;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

}
