package banco;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import model.Paciente;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Banco {
	
	private ObjectContainer db;
	private ObjectSet<Paciente> resultPaciente;
	
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

	public void close() {
		db.close();
	}

	
	
	
}
	
	
