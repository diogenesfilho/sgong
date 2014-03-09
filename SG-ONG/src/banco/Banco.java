package banco;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
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
	
	public ArrayList<Paciente> listarPacientes(){

		ObjectSet listaDoBanco = db.query(Paciente.class);
		ArrayList<Paciente> listaPacientes = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaPacientes.add((Paciente) listaDoBanco.get(i));
		}
		
		return listaPacientes;
		
	}

	public ArrayList<Socio> listarSocios(){

		ObjectSet listaDoBanco = db.query(Socio.class);
		ArrayList<Socio> listaSocios = new ArrayList<>();
		
		for (int i = 0; i < listaDoBanco.size(); i++) {
			listaSocios.add((Socio) listaDoBanco.get(i));
		}
		
		return listaSocios;
		
	}
	
	public void close() {
		db.close();
	}

	
	
	
}
	
	
