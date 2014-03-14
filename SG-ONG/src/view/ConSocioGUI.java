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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConSocioGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Socio> listaSociosTabela, listaSociosRefresh, busca;
	private TableView<Socio> tabela;
	private Button procurar, excluir, cancelarBusca;
	private Banco banco;
	
	public ConSocioGUI(){
		
		Label titulo = new Label("Relação de Sócios");
		titulo.setFont(new Font(30));
		
		Label procuraText = new Label("Procurar por nome:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		procurar = new Button("Procurar");
		excluir = new Button("Excluir sócio");
		cancelarBusca = new Button("Cancelar busca");
		cancelarBusca.setVisible(false);
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar, cancelarBusca);
		
		banco = Main.getBanco();
		
		listaSociosTabela = FXCollections.observableArrayList(
	            
				banco.listarSocios()
	            
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
	    nascCol.setMinWidth(150);
	    nascCol.setCellValueFactory(new PropertyValueFactory("nascimento"));
	        
	    TableColumn telCol = new TableColumn();
	    telCol.setText("Telefone");
	    telCol.setMinWidth(100);
	    telCol.setCellValueFactory(new PropertyValueFactory("telefone"));
	        
	    TableColumn tipoCol = new TableColumn();
	    tipoCol.setText("Tipo");
	    tipoCol.setMinWidth(120);
	    tipoCol.setCellValueFactory(new PropertyValueFactory("tipoSocio"));
	      
	    TableColumn dataCol = new TableColumn();
	    dataCol.setText("Data de Filiação");
	    dataCol.setMinWidth(120);
	    dataCol.setCellValueFactory(new PropertyValueFactory("dataFiliacao"));
	        
	    TableColumn emailCol = new TableColumn();
	    emailCol.setText("Email");
	    emailCol.setMinWidth(120);
	    emailCol.setCellValueFactory(new PropertyValueFactory("email"));
	        
	    TableColumn valorCol = new TableColumn();
	    valorCol.setText("Valor de contribuição");
	    valorCol.setMinWidth(170);
	    valorCol.setCellValueFactory(new PropertyValueFactory("valorContribuicao"));

	   
	    tabela = new TableView();
	    tabela.setItems(listaSociosTabela);
	    tabela.setMaxHeight(400);
	    tabela.setMaxWidth(1100);
	    tabela.getColumns().addAll(nomeCol, endCol, cidadeCol, estadoCol, rgCol, cpfCol, nascCol, telCol, tipoCol,dataCol, emailCol, valorCol);

	    HBox rodape = new HBox(20);
		rodape.getChildren().addAll(excluir);
		rodape.setTranslateX(120);

		VBox boxTop = new VBox(20);
		boxTop.getChildren().addAll(new MeuMenu(), titulo, hboxProcu, tabela, rodape);

		setTop(boxTop);
		boxTop.setAlignment(Pos.CENTER);
		hboxProcu.setAlignment(Pos.CENTER);
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String nomeProcurar = procuraField.getText();
				
				if (nomeProcurar.isEmpty() == false) {
					Socio socioBusca = new Socio(nomeProcurar, null, null, null, null, null, null, null, null, null, null);
					busca = FXCollections.observableArrayList(banco.listarSocios(socioBusca));
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
				listaSociosRefresh = FXCollections.observableArrayList(
				banco.listarSocios());
				tabela.setItems(listaSociosRefresh);
				cancelarBusca.setVisible(false);
			}
		});
		
		
		excluir.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if (tabela.getSelectionModel().getSelectedItem() == null) {
					new TelaAux("Selecione o sócio que deseja excluir");
				}else{
					Socio s = (Socio) tabela.getSelectionModel().getSelectedItem();
					banco.excluirObjeto(s);
					new TelaAux("Sócio removido");
					listaSociosRefresh = FXCollections.observableArrayList(banco.listarSocios());     
					tabela.setItems(listaSociosRefresh);
				}
			}
		});
		
	}

}
