package model;

public abstract class Pessoa {
	private String nome,endereco,cidade,estado,rG,cPF,nascimento,telefoneCelular;

	public Pessoa(String nome, String endereco, String cidade, String estado,String rG, String cPF, String nascimento,String TelefoneCelular){
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.rG = rG;
		this.cPF = cPF;
		this.nascimento = nascimento;;
		this.telefoneCelular = telefoneCelular;
		
	}

	//Gets e Sets;
	
	/**
	 * 
	 * @return informacao armazenada em nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o nome.
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return informacao armazenada em endereco.
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o endereco.
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	/**
	 * 
	 * @return  informacao armazenada em cidade.
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado a cidade.
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * @return informacao armazenada em estado.
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o estado.
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return informacao armazenada rg.
	 */
	public String getrG() {
		return rG;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o rg.
	 * @param rG
	 */
	public void setrG(String rG) {
		this.rG = rG;
	}

	/**
	 * 
	 * @return  informacao armazenada em cpf.
	 */
	public String getcPF() {
		return cPF;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o cpf.
	 * @param cPF
	 */
	public void setcPF(String cPF) {
		this.cPF = cPF;
	}

	/**
	 * 
	 * @return informacao armazenada em nascimento.
	 */
	public String getNascimento() {
		return nascimento;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o nascimento.
	 * @param nascimento
	 */
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	/**
	 * 
	 * @return informacao armazenada em TelefoneCelular.
	 */

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o telefone/celular.
	 * @param telefoneCelular
	 */
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

}
