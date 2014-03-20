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
	
	// Em db são guardados os objetos
	private ObjectContainer db;
	
	
	// Criando o banco
	public Banco() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "db");
	}
	
	// Adicionando no ObjectContainer
	public void addObjeto(Object o){
		db.store(o);
	}

	
	// Listando todos os objetos de determinada classe
	public ObjectSet listaObjeto(Class c){
		ObjectSet lista = db.query(c);
		return lista;
	}
	
	
	// Excluindo determinado objeto
	public void excluirObjeto(Object o){
		db.delete(o);
	}

	
	// Fechando banco
	public void close() {
		db.close();
	}
	
	
	// Verificações de CPF
	public boolean verificaCpfPacientes(String cpf){
		ObjectSet <Paciente> lista = db.query(Paciente.class);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCpf().equals(cpf)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean verificaCpfSocios(String cpf){
		ObjectSet <Socio> lista = db.query(Socio.class);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCpf().equals(cpf)) {
				return false;
			}
		}
		return true;
	}
	
	// Os métodos abaixo fazem a query no db com o parâmetro solicitado. Alguns colocam os objetos num 
	// ArrayList para serem aceitos em tableViews
	
	
	// Sobrecarga de método
	// Pesquisa de paciente - Botão buscar
	public ArrayList<Paciente> listarPacientes(Paciente p){

		String nomeBuscado = p.getNome();
		ObjectSet<Paciente> listaDoBanco = db.query(Paciente.class);
		ArrayList<Paciente> listaPacientes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			if (listaDoBanco.get(i).getNome().contains(nomeBuscado)) {
				listaPacientes.add(listaDoBanco.get(i));
			}
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
	
	// Pesquisa de Sócio - Botão buscar
	public ArrayList<Socio> listarSocios(Socio s){

		String nomeBuscado = s.getNome();
		ObjectSet<Socio> listaDoBanco = db.query(Socio.class);
		ArrayList<Socio> listaSocios = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			if (listaDoBanco.get(i).getNome().contains(nomeBuscado)) {
				listaSocios.add(listaDoBanco.get(i));
			}
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
	
	
	// Sobrecarga de método
	
	// Pesquisa de Doação - Botão buscar
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
	
	// Sobrecarga de método
	
	// Pesquisa de Despesa - Botão buscar
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
	
	

	
	
	
}
	
	
