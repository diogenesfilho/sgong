package model;

public class Paciente extends Pessoa {

	private String observacoes;
	private int residentesCasa;
	
	public Paciente(String nome, String endereco, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone, String dataFili,String observacoes, int residentesCasa) {
		super(nome,endereco,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone,dataFili);
		this.observacoes = observacoes;
		this.residentesCasa = residentesCasa;
				
	}

	//Gets e Sets;
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public int getResidentesCasa() {
		return residentesCasa;
	}

	public void setResidentesCasa(int residentesCasa) {
		this.residentesCasa = residentesCasa;
	}

}
