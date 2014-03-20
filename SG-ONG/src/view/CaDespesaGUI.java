package view;

import banco.Banco;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Despesa;
import model.Doacao;
import app.Main;


public class CaDespesaGUI extends BorderPane {
	
	private TextField valorField;
	private TextArea descField;
	private ComboBox<String> mesCombo;
	private ObservableList<String> listaDeMeses;
	private Label valor, descri, mes, titulo;
	private Button cadastrar, cancelar;
	
	public CaDespesaGUI(){
	
		//Criando os objetos

		valor = new Label("Valor:");
		descri = new Label("Descrição:");
		mes = new Label("Mês:");
		
		titulo = new Label("Cadastrar Despesa");
		titulo.setFont(new Font(40));
		
		valorField = new TextField();		
		valorField.setPromptText("Ex.: 100");
		
		listaDeMeses = FXCollections.observableArrayList();
		listaDeMeses.addAll("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
		mesCombo = new ComboBox<>();
		mesCombo.setItems(listaDeMeses);
		mesCombo.setMinSize(170, 20);
		
		descField = new TextArea();
		descField.setPrefSize(400, 100);
		descField.setPromptText("Ex.: Conta de energia");
		
		Image iconeCadastrar = new Image(getClass().getResourceAsStream("/image/add.png"));
		Button cadastrar = new Button("Cadastrar", new ImageView(iconeCadastrar));
		
		Image iconeCancelar = new Image(getClass().getResourceAsStream("/image/cancel.png"));
		cancelar = new Button("Cancelar", new ImageView(iconeCancelar));
		
		MeuMenu vboxtop = new MeuMenu(); 

		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(valor, valorField);
			
		HBox hbox2 = new HBox(38);
		hbox2.getChildren().addAll(mes, mesCombo);
				
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(descri,descField);
		
		HBox hbox4 = new HBox(30);
		hbox4.getChildren().addAll(cadastrar,cancelar);
				
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(titulo,hbox1,hbox2,hbox3,hbox4);
				
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
				
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
				getScene().setRoot(new TelaPrincipal());
				
			}
		});
		
		
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			
			
			@Override
			public void handle(ActionEvent event) {
								
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
						
					Despesa despesa = new Despesa(valor, descField.getText(), mesCombo.getSelectionModel().getSelectedItem());
								
					Banco banco = Main.getBanco();
					banco.addObjeto(despesa);
					new TelaAux("Despesa cadastrada com sucesso!");
					limpaCampos();
				
				}
				
				} catch (NumberFormatException nfe){
					new TelaAux("Dados inválidos!");
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
