package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConsultaPaciente extends BorderPane {

	private TableView tabela = new TableView();
	
	@SuppressWarnings("unchecked")
	public ConsultaPaciente() {
		
		Label titulo = new Label("Relação de Pacientes");
		titulo.setFont(new Font(30));
		
		tabela.setEditable(true);
		
		TableColumn colunaNome = new TableColumn("Nome");
		TableColumn colunaEndereco = new TableColumn("Endereço");
		TableColumn colunaBairro = new TableColumn("Bairro");
		TableColumn colunaCidade = new TableColumn("Cidade");
		TableColumn colunaEstado = new TableColumn("Estado");
		TableColumn colunaRG = new TableColumn("RG");
		TableColumn colunaCPF = new TableColumn("CPF");
		TableColumn colunaDataNasc = new TableColumn("Data de Nascimento");
		
		tabela.getColumns().addAll(colunaNome, colunaEndereco, colunaBairro, colunaCidade, colunaEstado, colunaRG, colunaCPF, colunaDataNasc);
//		tableView.setFocusTraversable(true);
		
		HBox hbox = new HBox(20);
		hbox.setAlignment(Pos.BASELINE_CENTER);

		VBox boxTop = new VBox(20);
		boxTop.setAlignment(Pos.CENTER);
		
		VBox boxTable = new VBox();
		boxTable.setPadding(new Insets(0, 10, 0, 10));
		boxTable.getChildren().add(tabela);
		boxTop.getChildren().addAll(new MeuMenu(), titulo, boxTable, hbox);
		setTop(boxTop);
		
		
	}
	
}