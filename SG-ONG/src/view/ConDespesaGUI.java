package view;


import java.util.ArrayList;

import app.Main;
import banco.Banco;
import banco.InfoBD;
import model.Despesa;
import model.Doacao;
import model.Paciente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConDespesaGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Despesa> listaDespesasTabela, busca;
	private TableView tabela;
	private Button procurar, excluir, cancelarBusca;
	
	public ConDespesaGUI(){
		
		Label titulo = new Label("Relação de Despesas");
		titulo.setFont(new Font(30));
		
		Label procuraText = new Label("Procurar por descrição:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		procurar = new Button("Procurar");
		excluir = new Button("Excluir despesa");
		cancelarBusca = new Button("Cancelar busca");
		cancelarBusca.setVisible(false);
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar, cancelarBusca);
		
		final Banco banco = Main.getBanco();
		
		
		listaDespesasTabela = FXCollections.observableArrayList(
	            
				banco.listarDespesas()
	            
	        );
	        TableColumn valorCol = new TableColumn();
	        valorCol.setText("Valor");
	        valorCol.setMinWidth(100);
	        valorCol.setCellValueFactory(new PropertyValueFactory("valor"));
	        
	        TableColumn mesCol = new TableColumn();
	        mesCol.setText("Mês");
	        mesCol.setMinWidth(100);
	        mesCol.setCellValueFactory(new PropertyValueFactory("mes"));
	        
	        TableColumn descCol = new TableColumn();
	        descCol.setText("Descrição");
	        descCol.setMinWidth(300);
	        descCol.setCellValueFactory(new PropertyValueFactory("descricao"));
	        
	        
	   
	        tabela = new TableView();
	        tabela.setItems(listaDespesasTabela);
	        tabela.setMaxHeight(400);
	        tabela.setMaxWidth(502);
	        tabela.getColumns().addAll(valorCol, mesCol, descCol);

	        
	        
	        
		HBox hbox = new HBox(20);
		hbox.setAlignment(Pos.BASELINE_CENTER);

		VBox boxTop = new VBox(20);
		boxTop.setAlignment(Pos.CENTER);
		hboxProcu.setAlignment(Pos.CENTER);
		
		VBox boxTable = new VBox();
		boxTop.getChildren().addAll(new MeuMenu(), titulo, hboxProcu, tabela, boxTable, hbox);

		setTop(boxTop);
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String nomeProcurar = procuraField.getText();
				Despesa despesaBusca = new Despesa(0, nomeProcurar, null);
				busca = FXCollections.observableArrayList(banco.listarDespesasBusca(despesaBusca));
			    tabela.setItems(busca);
			    cancelarBusca.setVisible(true);				
			}
		});
		
		cancelarBusca.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				tabela.setItems(listaDespesasTabela);
				cancelarBusca.setVisible(false);
			}
		});
		
	}

}
