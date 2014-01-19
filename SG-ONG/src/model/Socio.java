package model;

public class Socio extends Pessoa {

	private String TipoSocio,dataArrecada,profissao;
	private double valorContri;
	
	public Socio(String nome, String endereco, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone, String complemento, String dataFili, String email,String TipoSocio, String dataArrecada, String profissao, double valorContri) {
		super(nome,endereco,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone,complemento,dataFili,email);
		this.TipoSocio = TipoSocio;
		this.dataArrecada = dataArrecada;
		this.profissao = profissao;
		this.valorContri = valorContri;
	}
	
	//inset rows.
	public void consultaSocio(){
		
	}
	
	//Gets e Sets;
	public String getTipoSocio() {
		return TipoSocio;
	}

	public void setTipoSocio(String tipoSocio) {
		TipoSocio = tipoSocio;
	}

	public String getDataArrecada() {
		return dataArrecada;
	}

	public void setDataArrecada(String dataArrecada) {
		this.dataArrecada = dataArrecada;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getValorContri() {
		return valorContri;
	}

	public void setValorContri(double valorContri) {
		this.valorContri = valorContri;
	}
	
}
