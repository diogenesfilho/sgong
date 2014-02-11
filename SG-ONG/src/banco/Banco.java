package banco;

import java.util.List;

import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Banco {
	
	private List <Paciente> listaPacientes;
	private List <Socio> listaSocio;
	private List <Doacao> listaDoacao;
	private List <Despesa> listaDespesas;
	
	private ObjectContainer db;
	private String nomeBanco;
	
	public Banco(String nomeBanco){
		this.nomeBanco = nomeBanco;
		this.db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), nomeBanco);	
	}
	
	public void addPaciente(Paciente paciente){
		db.store(paciente);
		
	}
	
	public void addSocio(Socio socio){
		db.store(socio);
		
	}
	
	public Paciente verPaciente(String nome){
		listaPacientes = db.query(Paciente.class);
		for (Paciente p : listaPacientes){
			if (p.getNome().equals(nome)){
				return p;
			}
		}
		return null;
	}
	
	public Socio verSocio(String nome){
		listaSocio = db.query(Socio.class);
		for (Socio s : listaSocio){
			if (s.getNome().equals(nome)){
				return s;
			}
		}
		return null;
	}
}
