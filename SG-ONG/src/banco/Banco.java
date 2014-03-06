package banco;

import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import excecoes.DadosException;

public class Banco {
	
	private ObjectContainer db;
	
	// criando
	public Banco() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "db");
	}
	
	
	public void addObjeto(Object o){
		db.store(o);
	}
	
	public ObjectSet listaPacientes(){
		ObjectSet lista = db.query(Paciente.class);
		return lista;	
	}
	
	public ObjectSet listaSocios(){
		ObjectSet lista = db.query(Socio.class);
		return lista;	
	}
	
	public ObjectSet listaDoacoes(){
		ObjectSet lista = db.query(Doacao.class);
		return lista;	
	}
	
	public ObjectSet listaDespesas(){
		ObjectSet lista = db.query(Despesa.class);
		return lista;	
	}


	public void close() {
		db.close();
	}
	
}