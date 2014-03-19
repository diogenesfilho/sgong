package view;

import app.Main;
import banco.Banco;
import model.Paciente;
import model.Socio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConPacienteGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Paciente> listaPacientesTabela, listaPacientesRefresh, busca;
	private TableView<Paciente> tabela;
	private Button procurar,excluir, cancelarBusca;
	private Banco banco;
	private Label titulo, procuraText;
	
	public ConPacienteGUI(){
		
		setFocusTraversable(true);
				
		
		titulo = new Label("Relação de Pacientes");
		titulo.setFont(new Font(30));
		
		procuraText = new Label("Procurar por nome:");
		procuraField = new TextField();
		
		procuraField.setPromptText("Ex.: Pedro Victor");
		procuraField.setPrefSize(620.0, 27.0); 
		
		Image iconeProcurar = new Image(getClass().getResourceAsStream("/image/procurar.png"));
		procurar = new Button("Procurar", new ImageView(iconeProcurar));
		
	
		Image iconeExcluir = new Image(getClass().getResourceAsStream("/image/delete.png"));
		excluir = new Button("Excluir paciente", new ImageView(iconeExcluir));
		
		cancelarBusca = new Button("Cancelar busca");
		
		cancelarBusca.setVisible(false);
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar,cancelarBusca);
		
		banco = Main.getBanco();
		
		listaPacientesTabela = FXCollections.observableArrayList(banco.listarPacientes());
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
	    nascCol.setMinWidth(150);
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
	    tabela.setItems(listaPacientesTabela);
	    tabela.setMaxHeight(400);
	    tabela.setMaxWidth(1000);
	    tabela.getColumns().addAll(nomeCol, endCol, cidadeCol, estadoCol, rgCol, cpfCol, nascCol, telCol, obsCol);
	    

		HBox rodape = new HBox(20);
		rodape.getChildren().addAll(excluir);
		
		VBox boxTop = new VBox(20);
		boxTop.getChildren().addAll(new MeuMenu(), titulo, hboxProcu, tabela, rodape);
		
		setTop(boxTop);
		boxTop.setAlignment(Pos.CENTER);
		hboxProcu.setAlignment(Pos.CENTER);
		rodape.setAlignment(Pos.CENTER);
		
		
		// Eventos
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				String nomeProcurar = procuraField.getText();
				
				if (nomeProcurar.isEmpty() == false) {
					Paciente pacienteBusca = new Paciente(nomeProcurar, null, null, null, null, null, null, null, null);
					busca = FXCollections.observableArrayList(banco.listarPacientes(pacienteBusca));
				    tabela.setItems(busca);
				    cancelarBusca.setVisible(true);
				} else {
					new TelaAux("Digite um nome para buscar");
				}
				
			}
		});
		
		cancelarBusca.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				atualizaTabela();
				cancelarBusca.setVisible(false);
			}
		});

		excluir.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if (tabela.getSelectionModel().getSelectedItem() == null) {
					new TelaAux("Selecione o paciente que deseja excluir");
				}else{
					Paciente p = tabela.getSelectionModel().getSelectedItem();
					new TelaAux(p, "Deseja remover "+ p.getNome() +"?", tabela);
				}
			}
		});

	}


	public void atualizaTabela(){
		listaPacientesRefresh = FXCollections.observableArrayList(banco.listarPacientes());
		tabela.setItems(listaPacientesRefresh);
	}

}
