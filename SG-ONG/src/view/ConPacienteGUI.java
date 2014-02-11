package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConPacienteGUI extends BorderPane {
	
	
	public TextField procuraField;
	private TableView tabela = new TableView();
	
	@SuppressWarnings("unchecked") // Toma pro sua conta os erros e os ignora.
	public ConPacienteGUI() {
		
		Label titulo = new Label("Relação de Pacientes");
		titulo.setFont(new Font(30));
		
		Label procuraText = new Label("Procurar por nome:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		Button procurar = new Button("Procurar");
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar);
		
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
		hboxProcu.setAlignment(Pos.CENTER);
		
		VBox boxTable = new VBox();
		boxTable.setPadding(new Insets(0, 10, 0, 10));
		boxTable.getChildren().add(tabela);
		boxTop.getChildren().addAll(new MeuMenu(), titulo,hboxProcu, boxTable, hbox);

		setTop(boxTop);
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				String nomeProcurar = procuraField.getText();
				// Método que será responsável por fazer a procura no banco. SELECT * FROM BANCO WHERE nome LIKE "nomeProcurar";
				
			}
		});
		
		
//		//Função Double Click para editar.
//		tabela.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
//                    if(mouseEvent.getClickCount() == 2){
//                        System.out.println("Double clicked");
//                    }
//                }
//            }
//        });
		
		
	}
	
}