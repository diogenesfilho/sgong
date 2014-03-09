package model;

public class Paciente extends Pessoa {

	private String observacoes;
	
	public Paciente(String nome, String endereco, String cidade, String estado,String rg, String cpf, String nascimento, String telefone,String observacoes) {
		super(nome,endereco,cidade,estado,rg,cpf,nascimento,telefone);
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
		return getNome() + " " + getCpf();
	}
}
