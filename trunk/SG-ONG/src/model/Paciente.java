package model;

public class Paciente extends Pessoa {

	private String obsMedicas;
	private int residentesCasa;
	
	public Paciente(String nome, String endereco, String bairro, String cidade, String estado,String rG, String cPF, String nascimento,String celular, String telefone, String complemento, String dataFili, String email,String obsMedicas, int residentesCasa) {
		super(nome,endereco,bairro,cidade,estado,rG,cPF,nascimento,celular,telefone,complemento,dataFili,email);
		this.obsMedicas = obsMedicas;
		this.residentesCasa = residentesCasa;
				
	}
	
	//?
	public void consultaPaciente(){
		
	}
	
	//Gets e Sets;
	public String getObsMedicas() {
		return obsMedicas;
	}

	public void setObsMedicas(String obsMedicas) {
		this.obsMedicas = obsMedicas;
	}

	public int getResidentesCasa() {
		return residentesCasa;
	}

	public void setResidentesCasa(int residentesCasa) {
		this.residentesCasa = residentesCasa;
	}

}
