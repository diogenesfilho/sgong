package model;

public class Paciente extends Pessoa {

	private String observacoes;
	
	public Paciente(String nome, String endereco, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone, String dataFili,String observacoes) {
		super(nome,endereco,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone,dataFili);
		this.observacoes = observacoes;
				
	}

	//Gets e Sets;
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
