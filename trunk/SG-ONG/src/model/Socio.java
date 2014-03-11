package model;

public class Socio extends Pessoa {

	private String tipoSocio,dataArrecada,profissao,dataFiliacao,email;
	
	public Socio(String nome, String endereco, String cidade, String estado,String rg, String cpf, String nascimento, String telefonecelular, String tipoSocio,String dataFiliacao, String email) throws NumberFormatException{
		super(nome, endereco, cidade, estado, rg, cpf, nascimento, telefonecelular);
		this.tipoSocio = tipoSocio;
		this.dataFiliacao = dataFiliacao;
		this.email = email;
	}


	//Gets e Sets;
	public String getDataFiliacao() {
		return dataFiliacao;
	}

	public void setDataFiliacao(String dataFiliacao) {
		this.dataFiliacao = dataFiliacao;
	}

	public String getTipoSocio() {
		return tipoSocio;
	}

	public void setTipoSocio(String tipoSocio) {
		this.tipoSocio = tipoSocio;
	}	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return getNome();
	}
}
