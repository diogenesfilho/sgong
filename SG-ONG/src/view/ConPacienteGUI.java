package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Paciente;
import app.Main;

public class ConPacienteGUI extends VBox{
	
	private ListView<Paciente> listaPaciente;
	private Text titulo;
	private Button botao;
	
	public ConPacienteGUI() {
		
		listaPaciente = new ListView<>();
		titulo = new Text("Lista de Pacientes");
		botao = new Button("OK");
		
		setSpacing(30);
		setAlignment(Pos.CENTER);
		setPadding(new Insets(100,300,100,300));
		
		listaPaciente.setItems(Main.getBanco().capturarPacientes());
		listaPaciente.setOpacity(0.75);
		getChildren().addAll(titulo,listaPaciente,botao);
		
	}
	
}
