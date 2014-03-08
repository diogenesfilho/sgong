package model;

public class Paciente extends Pessoa {

	private String observacoes;
	
	public Paciente(String nome, String endereco, String cidade, String estado,String rG, String cPF, String nascimento, String telefoneCelular,String observacoes) {
		super(nome,endereco,cidade,estado,rG,cPF,nascimento,telefoneCelular);
		this.observacoes = observacoes;
				
	}

	//Gets e Sets;
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	public String toString(){
		return getNome()+"%"+getEndereco()+"%"+getEstado()+"%"+getrg()+"%"+getcpf()+"%"+getNascimento()+"%"+getTelefoneCelular()+"%"+getObservacoes();
	}
}
