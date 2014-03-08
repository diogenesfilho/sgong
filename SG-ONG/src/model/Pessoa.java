package model;

public abstract class Pessoa {
	private String nome,endereco,cidade,estado,rg,cpf,nascimento,telefone;

	public Pessoa(String nome, String endereco, String cidade, String estado,String rg, String cpf, String nascimento,String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.rg = rg;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		
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
	public String getRg() {
		return rg;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o rg.
	 * @param rg
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * 
	 * @return  informacao armazenada em cpf.
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o cpf.
	 * @param cpf
	 */
	public void setCpf(String cpf) {
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

	public String getTelefone() {
		return telefone;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o telefone/celular.
	 * @param telefoneCelular
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
