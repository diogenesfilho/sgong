package model;

public class Socio extends Pessoa {

	private String tipoSocio,dataArrecada,profissao,dataFiliacao,email;
	private double valorContribuicao;
	
	public Socio(String nome, String endereco, String cidade, String estado,String rG, String cPF, String nascimento, String telefoneCelular,String tipoSocio, String dataFiliacao, String email, double valorContribuicao) {
		super(nome, endereco, cidade, estado, rG, cPF, nascimento, telefoneCelular);
		this.tipoSocio = tipoSocio;
		this.dataFiliacao = dataFiliacao;
		this.valorContribuicao = valorContribuicao;
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

	public double getValorContribuicao() {
		return valorContribuicao;
	}

	public void setValorContribuicao(double valorContribuicao) {
		this.valorContribuicao = valorContribuicao;
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
