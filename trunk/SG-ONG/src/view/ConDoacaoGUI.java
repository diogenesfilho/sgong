package view;


import java.util.ArrayList;

import app.Main;
import banco.Banco;
import banco.InfoBD;
import model.Doacao;
import model.Paciente;
import model.Socio;
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

public class ConDoacaoGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Doacao> listaDoacoesTabela, listaDoacoesRefresh, busca;
	private TableView tabela;
	private Button procurar, excluir, cancelarBusca;
	private Banco banco;
	private Label titulo, procuraText;
	
	public ConDoacaoGUI(){
		
		setFocusTraversable(true);
		
		titulo = new Label("Relação de Doações");
		titulo.setFont(new Font(30));
		
		procuraText = new Label("Procurar por descrição:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		procuraField.setPromptText("Ex.: Cesta básica");		
		
		procurar = new Button("Procurar");
		excluir = new Button("Excluir doação");
		cancelarBusca = new Button("Cancelar busca");
		cancelarBusca.setVisible(false);
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar, cancelarBusca);
		
		banco = Main.getBanco();
		final Doacao doacaoValor = new Doacao(0, null, null);
		listaDoacoesTabela = FXCollections.observableArrayList(banco.listarDoacoes());
		
	    TableColumn valorCol = new TableColumn();
	    valorCol.setText("Valor (R$)");
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
	    tabela.setItems(listaDoacoesTabela);
	    tabela.setMaxHeight(400);
	    tabela.setMaxWidth(502);
	    tabela.getColumns().addAll(valorCol, mesCol, descCol);

	        
	    HBox rodape = new HBox(20);
		rodape.getChildren().addAll(excluir);

		VBox boxTop = new VBox(20);
		boxTop.getChildren().addAll(new MeuMenu(), titulo, hboxProcu, tabela, rodape);

		setTop(boxTop);
		boxTop.setAlignment(Pos.CENTER);
		hboxProcu.setAlignment(Pos.CENTER);
		rodape.setAlignment(Pos.CENTER);
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String nomeProcurar = procuraField.getText();
				
				if (nomeProcurar.isEmpty() == false) {
					Doacao doacaoBusca = new Doacao(0, nomeProcurar, null);
					busca = FXCollections.observableArrayList(banco.listarDoacoesBusca(doacaoBusca));
					tabela.setItems(busca);
					cancelarBusca.setVisible(true);
				} else {
					new TelaAux("Digite uma descrição para buscar");
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
					new TelaAux("Selecione a doação que deseja excluir");
				}else{
					Doacao doa = (Doacao) tabela.getSelectionModel().getSelectedItem();
					new TelaAux(doa, "Deseja remover "+ doa.getDescricao() +"?", tabela);
				}
			}
		});
		
	}
	
	public void atualizaTabela(){
		listaDoacoesRefresh = FXCollections.observableArrayList(banco.listarDoacoes());
		tabela.setItems(listaDoacoesRefresh);
	}


}
