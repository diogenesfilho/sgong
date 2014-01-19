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
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getrG() {
		return rG;
	}

	public void setrG(String rG) {
		this.rG = rG;
	}

	public String getcPF() {
		return cPF;
	}

	public void setcPF(String cPF) {
		this.cPF = cPF;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone2(String telefone) {
		this.telefone = telefone;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDataFili() {
		return dataFili;
	}

	public void setDataFili(String dataFili) {
		this.dataFili = dataFili;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
