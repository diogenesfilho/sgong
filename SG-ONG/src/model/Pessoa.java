package model;

public class Pessoa {
	private String nome,endereco,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone,complemento,dataFili,email;
	
	public Pessoa(){
	}
	
	public Pessoa(String nome, String endereco, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone, String complemento, String dataFili, String email){
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.rG = rG;
		this.cPF = cPF;
		this.nascimento = nascimento;
		this.celular = celular;
		this.telefone = telefone;
		this.complemento = complemento;
		this.dataFili = dataFili;
		this.email = email;		
		
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
	 * @return informacao armazenada em bairro.
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o bairro.
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	 * @return informacao armazenada em celular.
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o celular.
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * 
	 * @return  informacao armazenada em telefone.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o telefone.
	 * @param telefone
	 */
	public void setTelefone2(String telefone) {
		this.telefone = telefone;
	}
	
	
	/**
	 * 
	 * @return informacao armazenada em complemento.
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o complemento.
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * 
	 * @return informacao armazenada em dataFili, que corresponde a data da filiacao.
	 */
	public String getDataFili() {
		return dataFili;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado a data da filiacao.
	 * @param dataFili
	 */
	public void setDataFili(String dataFili) {
		this.dataFili = dataFili;
	}

	/**
	 * 
	 * @return informacao armazenada em email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Este metodo sera chamado quando for necessario ser armazenado o email.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
