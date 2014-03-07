package banco;

import java.lang.reflect.Array;

import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;
import app.Main;

public class InfoBD {

	private Banco banco = Main.getBanco();
	private int quantidadeSocios = banco.listaObjeto(Socio.class).size();
	private int quantidadePacientes = banco.listaObjeto(Paciente.class).size();
	private int quantidadeDoacoes = banco.listaObjeto(Doacao.class).size();
	private int quantidadeDespesas = banco.listaObjeto(Despesa.class).size();
	
	public String getQuantidadeSocios() {
		return "Sócios cadastrados: " + quantidadeSocios;
	}

	public String getQuantidadePacientes() {
		return "Pacientes cadastrados: " + quantidadePacientes;
	}
	
	public String getQuantidadeDoacoes() {
		return "Doações cadastradas: " + quantidadeDoacoes;
	}

	public String getQuantidadeDespesas() {
		return "Despesas cadastradas: " + quantidadeDespesas;
	}
	

}
