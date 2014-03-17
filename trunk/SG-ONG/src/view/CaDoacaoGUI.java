package view;

import banco.Banco;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Doacao;
import app.Main;


public class CaDoacaoGUI extends BorderPane {
	
	private TextField valorField;
	private ComboBox<String> mesCombo;
	private TextArea descField;
	private ObservableList<String> listaDeMeses;
	private Label valor, descri, mes, textoAux, titulo;
	private ToggleButton tb1, tb2;
	private ToggleGroup group;
	private Button cadastrar, cancelar;

	public CaDoacaoGUI(){
		
		//Criando os objetos
		
		valor = new Label("Valor:");
		descri = new Label("Descrição:");
		mes = new Label("Mês:");
		
		textoAux = new Label("Selecione um tipo de doação:"+"\n"+"'Valor' para cadastrar uma doação em dinheiro. Ex: R$ 100"+"\n"+"'Item' para cadastrar uma doação em itens. Ex: Cesta Básica");
		textoAux.setFont(new Font(15));
		
		tb1 = new ToggleButton("Valor");
	    tb2 = new ToggleButton("Item");
	    group = new ToggleGroup();
	    tb1.setToggleGroup(group);
	    tb2.setToggleGroup(group);
	    
	    group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle selectedToggle) {
	
				if (selectedToggle == tb2) {
					valorField.setText("0");
					valorField.setVisible(false);
					valor.setVisible(false);
					
				}else {
					valorField.setText("");
					valorField.setVisible(true);
					valor.setVisible(true);
				}
				
			}
	    	
		});
	    
	        
	    HBox seletor = new HBox(20);
	    seletor.getChildren().addAll(tb1,tb2);
		
		listaDeMeses = FXCollections.observableArrayList();
		listaDeMeses.addAll("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
		mesCombo = new ComboBox<>();
		mesCombo.setItems(listaDeMeses);
		mesCombo.setMinSize(170, 20);
		
		titulo = new Label("Cadastrar Doação");
		titulo.setFont(new Font(40));
		
		valorField = new TextField();
		valorField.setPromptText("Ex.: 100");
		
		descField = new TextArea();
		descField.setPromptText("Ex.: Doado por José");
		descField.setPrefSize(400, 100);
		
		cadastrar = new Button("Cadastrar");
		cancelar = new Button("Cancelar");
		
		MeuMenu vboxtop = new MeuMenu(); 

		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(valor, valorField);
		
		HBox hbox2 = new HBox(38);
		hbox2.getChildren().addAll(mes,mesCombo);
			
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(cadastrar,cancelar);
				
		HBox hbox4 = new HBox(30);
		hbox4.getChildren().addAll(descri,descField);
				
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(titulo,textoAux, seletor,hbox1,hbox2,hbox4,hbox3);
				
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
				
		textoAux.setAlignment(Pos.CENTER);
		seletor.setAlignment(Pos.CENTER);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		hbox4.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
				
		vbox.setPadding(new Insets(10,100,10,100));
				
		setCenter(vbox);

		
		//Background
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		
		setCenter(stack);
		setTop(vboxtop);     //Setando menuBar sempre no topo
	
		
		cancelar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {				
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
		
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				if (group.getSelectedToggle() == null) {
					new TelaAux("Escolha um tipo de doação! (Valor ou Item)");
				}
				
				else if (group.getSelectedToggle() == tb1) {
					try{
						
						String s = valorField.getText();
						Double valor = Double.parseDouble(s);
						
						if(Integer.parseInt(valorField.getText()) <= 0){
							new TelaAux("Valor inválido!");
						}else if(mesCombo.getSelectionModel().getSelectedItem() == null){
							new TelaAux("Informe o mês!");
						}else if(descField.getText().equals("")){
							new TelaAux("Adicione uma descrição!");
						}else{
							
						Doacao doacao = new Doacao(valor, descField.getText(), mesCombo.getSelectionModel().getSelectedItem());
									
						Banco banco = Main.getBanco();
						banco.addObjeto(doacao);
						new TelaAux("Doação cadastrada com sucesso!");
						limpaCampos();
					
					}
					
					} catch (NumberFormatException nfe){
						new TelaAux("Dados inválidos!");
					}
				}
				
				else if (group.getSelectedToggle() == tb2) {
					try{
			
						if(mesCombo.getSelectionModel().getSelectedItem() == null){
							new TelaAux("Informe o mês!");
						}else if(descField.getText().equals("")){
							new TelaAux("Adicione uma descrição!");
						}else{
							
						Doacao doacao = new Doacao(descField.getText(), mesCombo.getSelectionModel().getSelectedItem());
									
						Banco banco = Main.getBanco();
						banco.addObjeto(doacao);
						new TelaAux("Doação cadastrada com sucesso!");
						limpaCampos();
					
					}
					
					} catch (Exception e){
						new TelaAux("Dados inválidos!");
					}
				}
			
				
				
			}
			
			private void limpaCampos() {
				valorField.setText("");
				descField.setText("");
				mesCombo.getSelectionModel().clearSelection();
				
			}
			
		});
	}
}
