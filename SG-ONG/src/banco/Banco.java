package banco;

import model.Paciente;
import model.Socio;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import exceções.DadosException;

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
	
}