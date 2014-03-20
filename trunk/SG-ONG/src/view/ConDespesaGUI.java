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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConDespesaGUI extends BorderPane {
	
	public TextField procuraField;
	private ObservableList<Despesa> listaDespesasTabela, listaDespesasRefresh, busca;
	private TableView tabela;
	private Button procurar, excluir, cancelarBusca;
	private Banco banco;
	private Label titulo, procuraText;
	
	public ConDespesaGUI(){
		
		setFocusTraversable(true);
		
		titulo = new Label("Relação de Despesas");
		titulo.setFont(new Font(30));
		
		procuraText = new Label("Procurar por descrição:");
		procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		procuraField.setPromptText("Ex.: Conta de água");
		
		Image iconeProcurar = new Image(getClass().getResourceAsStream("/image/procurar.png"));
		procurar = new Button("Procurar", new ImageView(iconeProcurar));
		
		
		Image iconeExcluir = new Image(getClass().getResourceAsStream("/image/delete.png"));
		excluir = new Button("Excluir despesa", new ImageView(iconeExcluir));
		
		Image iconeCancelar = new Image(getClass().getResourceAsStream("/image/cancel.png"));
		cancelarBusca = new Button("Cancelar busca", new ImageView(iconeCancelar));
		
		cancelarBusca.setVisible(false);
		
		HBox hboxProcu = new HBox(20);
		hboxProcu.getChildren().addAll(procuraText,procuraField,procurar, cancelarBusca);
		
		banco = Main.getBanco();		
		listaDespesasTabela = FXCollections.observableArrayList(banco.listarDespesas());
		
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
	        tabela.setItems(listaDespesasTabela);
	        tabela.setMaxHeight(400);
	        tabela.setMaxWidth(502);
	        tabela.getColumns().addAll(valorCol, mesCol, descCol);
	        
	        
	    HBox rodape = new HBox(20);
	    rodape.getChildren().addAll(excluir);
		
		VBox boxTop = new VBox(20);
		boxTop.getChildren().addAll(new MeuMenu(), titulo, hboxProcu, tabela, rodape);
		
		boxTop.setAlignment(Pos.CENTER);
		hboxProcu.setAlignment(Pos.CENTER);
		rodape.setAlignment(Pos.CENTER);
		setTop(boxTop);
		
		procurar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String nomeProcurar = procuraField.getText();
				
				if (nomeProcurar.isEmpty() == false) {
					Despesa despesaBusca = new Despesa(0, nomeProcurar, null);
					busca = FXCollections.observableArrayList(banco.listarDespesasBusca(despesaBusca));
					tabela.setItems(busca);
					cancelarBusca.setVisible(true);		
				}else {
					new TelaAux("Digite uma descrição para buscar");
				}			
			}
		});
		
		cancelarBusca.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				procuraField.setText("");
				atualizaTabela();
				cancelarBusca.setVisible(false);
			}
		});
		
		excluir.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if (tabela.getSelectionModel().getSelectedItem() == null) {
					new TelaAux("Selecione a despesa que deseja excluir");
				}else{
					Despesa des = (Despesa) tabela.getSelectionModel().getSelectedItem();
					new TelaAux(des, "Deseja remover "+ des.getDescricao() +"?", tabela);
				}
			}
		});
	}
	
	public void atualizaTabela(){
		listaDespesasRefresh = FXCollections.observableArrayList(banco.listarDespesas());
		tabela.setItems(listaDespesasRefresh);
	}

}
