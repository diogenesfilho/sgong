package view;


import banco.Banco;
import banco.InfoBD;
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

public class ConPacienteGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Paciente> listaPacientes;
	private TableView tabela;
	
	@SuppressWarnings("unchecked")
	public ConPacienteGUI(){
		
		Label titulo = new Label("Relação de Paciente");
		titulo.setFont(new Font(30));
		
		Label procuraText = new Label("Procurar por nome:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		Button procurar = new Button("Procurar");
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar);
		
		listaPacientes = FXCollections.observableArrayList(
	            new Paciente("nome", "end", "cid", "est", "rg", "cpf", "nasc", "tel", "obs")
	        );
	        TableColumn nomeCol = new TableColumn();
	        nomeCol.setText("Nome");
	        nomeCol.setMinWidth(100);
	        nomeCol.setCellValueFactory(new PropertyValueFactory("nome"));
	        
	        TableColumn endCol = new TableColumn();
	        endCol.setText("Endereço");
	        endCol.setMinWidth(100);
	        endCol.setCellValueFactory(new PropertyValueFactory("endereco"));
	        
	        TableColumn cidadeCol = new TableColumn();
	        cidadeCol.setText("Cidade");
	        cidadeCol.setMinWidth(100);
	        cidadeCol.setCellValueFactory(new PropertyValueFactory("cidade"));
	        
	        TableColumn estadoCol = new TableColumn();
	        estadoCol.setText("Estado");
	        estadoCol.setMinWidth(100);
	        estadoCol.setCellValueFactory(new PropertyValueFactory("estado"));
	        
	        TableColumn rgCol = new TableColumn();
	        rgCol.setText("RG");
	        rgCol.setMinWidth(100);
	        rgCol.setCellValueFactory(new PropertyValueFactory("rg"));
	        
	        TableColumn cpfCol = new TableColumn();
	        cpfCol.setText("CPF");
	        cpfCol.setMinWidth(100);
	        cpfCol.setCellValueFactory(new PropertyValueFactory("cpf"));
	        
	        TableColumn nascCol = new TableColumn();
	        nascCol.setText("Data de Nascimento");
	        nascCol.setMinWidth(100);
	        nascCol.setCellValueFactory(new PropertyValueFactory("nascimento"));
	        
	        TableColumn telCol = new TableColumn();
	        telCol.setText("Telefone");
	        telCol.setMinWidth(100);
	        telCol.setCellValueFactory(new PropertyValueFactory("telefone"));
	        
	        TableColumn obsCol = new TableColumn();
	        obsCol.setText("Observações");
	        obsCol.setMinWidth(120);
	        obsCol.setCellValueFactory(new PropertyValueFactory("observacoes"));

	   
	        tabela = new TableView();
	        tabela.setItems(listaPacientes);
	        tabela.setMaxHeight(400);
	        tabela.setMaxWidth(920);
	        tabela.getColumns().addAll(nomeCol, endCol, cidadeCol, estadoCol, rgCol, cpfCol, nascCol, telCol, obsCol);

	        
	        
	        
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
				// Método que será responsável por fazer a procura no banco. SELECT *
				
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
