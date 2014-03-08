package model;

public abstract class Pessoa {
	private String nome,endereco,cidade,estado,rg,cpf,nascimento,telefoneCelular;

	public Pessoa(String nome, String endereco, String cidade, String estado,String rg, String cpf, String nascimento,String TelefoneCelular){
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.rg = rg;
		this.cpf = cpf;
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
	public String getrg() {
		return rg;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o rg.
	 * @param rg
	 */
	public void setrg(String rg) {
		this.rg = rg;
	}

	/**
	 * 
	 * @return  informacao armazenada em cpf.
	 */
	public String getcpf() {
		return cpf;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o cpf.
	 * @param cpf
	 */
	public void setcpf(String cpf) {
		this.cpf = cpf;
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
