package banco;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Banco {
	
	private ObjectContainer db;
	
	public Banco() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "db");
	}
	
	public void addObjeto(Object o){
		db.store(o);
	}

	public ObjectSet listaObjeto(Class c){
		ObjectSet lista = db.query(c);
		return lista;
	}
	
	// Sobrecarga de método
	public ArrayList<Paciente> listarPacientes(Paciente p){

		ObjectSet listaDoBanco = db.queryByExample(p);
		ArrayList<Paciente> listaPacientes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaPacientes.add((Paciente) listaDoBanco.get(i));
		}
		
		return listaPacientes;
		
	} 
	
	public ArrayList<Paciente> listarPacientes(){

		ObjectSet listaDoBanco = db.query(Paciente.class);
		ArrayList<Paciente> listaPacientes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaPacientes.add((Paciente) listaDoBanco.get(i));
		}
		
		return listaPacientes;
		
	}
	
	// Sobrecarga de método
	public ArrayList<Socio> listarSocios(Socio s){

		ObjectSet listaDoBanco = db.queryByExample(s);
		ArrayList<Socio> listaSocios = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaSocios.add((Socio) listaDoBanco.get(i));
		}
		
		return listaSocios;
		
	} 

	public ArrayList<Socio> listarSocios(){

		ObjectSet listaDoBanco = db.query(Socio.class);
		ArrayList<Socio> listaSocios = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaSocios.add((Socio) listaDoBanco.get(i));
		}
		
		return listaSocios;
		
	}
	
	
	// Método especial para retornar a doação caso esta contenha a descrição solicitada
	public ArrayList<Doacao> listarDoacoesBusca(Doacao doacao){

		String descricaoBuscada = doacao.getDescricao();
		ObjectSet<Doacao> listaDoBanco = db.query(Doacao.class);
		ArrayList<Doacao> listaDoacoes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			if (listaDoBanco.get(i).getDescricao().contains(descricaoBuscada)) {
				listaDoacoes.add(listaDoBanco.get(i));
			}
		}
		return listaDoacoes;
		
	} 
	
	
	public ArrayList<Doacao> listarDoacoes(){

		ObjectSet listaDoBanco = db.query(Doacao.class);
		ArrayList<Doacao> listaDoacoes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaDoacoes.add((Doacao) listaDoBanco.get(i));
		}
		
		return listaDoacoes;
		
	}
	
	// Método especial para retornar a despesa caso esta contenha a descrição solicitada
		public ArrayList<Despesa> listarDespesasBusca(Despesa despesa){

			String descricaoBuscada = despesa.getDescricao();
			ObjectSet<Despesa> listaDoBanco = db.query(Despesa.class);
			ArrayList<Despesa> listaDespesas = new ArrayList<>();
			
			for (int i = 0; i < listaDoBanco.size(); i++) {
				if (listaDoBanco.get(i).getDescricao().contains(descricaoBuscada)) {
					listaDespesas.add(listaDoBanco.get(i));
				}
			}
			return listaDespesas;
			
		} 
	
	public ArrayList<Despesa> listarDespesas(){

		ObjectSet listaDoBanco = db.query(Despesa.class);
		ArrayList<Despesa> listaDespesas = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaDespesas.add((Despesa) listaDoBanco.get(i));
		}
		
		return listaDespesas;
		
	}
	
	public void excluirObjeto(Object o){
		db.delete(o);
	}

	
	public void close() {
		db.close();
	}

	
	
	
}
	
	
