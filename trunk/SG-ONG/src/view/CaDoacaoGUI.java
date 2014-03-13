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
import javafx.scene.control.SingleSelectionModel;
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
import model.Doacao;
import app.Main;


public class CaDoacaoGUI extends BorderPane {
	
	private TextField valorField;
	private ComboBox<String> mesCombo;
	private TextArea descField;
	private ObservableList<String> listaDeMeses;
	
	public CaDoacaoGUI(){
	
		//Criando os objetos
		
		Label textoAux = new Label("Caso a doação seja em ITENS, informe 0 no campo 'Valor'");
		textoAux.setFont(new Font(15));

		Label valor = new Label("Valor:");
		Label descri = new Label("Descrição:");
		Label mes = new Label("Mês:");
		
		listaDeMeses = FXCollections.observableArrayList();
		listaDeMeses.addAll("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
		mesCombo = new ComboBox<>();
		mesCombo.setItems(listaDeMeses);
		mesCombo.setMinSize(170, 20);
		
		Label titulo = new Label("Cadastrar Doação");
		titulo.setFont(new Font(40));
		
		valorField = new TextField();				
		descField = new TextArea();
		descField.setPrefSize(400, 100);
		
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
		MeuMenu vboxtop = new MeuMenu(); 

		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(valor, valorField);
		
		HBox hbox2 = new HBox(30);
		hbox2.getChildren().addAll(mes,mesCombo);
			
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(cadastrar,cancelar);
				
		HBox hbox4 = new HBox(30);
		hbox4.getChildren().addAll(descri,descField);
				
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(titulo,textoAux,hbox1,hbox2,hbox4,hbox3);
				
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
				
		textoAux.setAlignment(Pos.CENTER);
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
				
				if(valorField.getText().equals("") && mesCombo.getSelectionModel().getSelectedItem() == null && descField.getText().equals("")){
					new TelaAux("Informe todos os campos!");
				}else if(valorField.getText().equals("")){
					new TelaAux("Informe o valor!");
				}else if(mesCombo.getSelectionModel().getSelectedItem() == null){
					new TelaAux("Informe o mês!");
				}else if(descField.getText().equals("")){
					new TelaAux("Adicione uma descrição!");
				}else if(Integer.parseInt(valorField.getText()) <= 0){
					new TelaAux("Valor Inválido!");
				}else{
					try{

						Doacao doacao = new Doacao(Double.parseDouble(valorField.getText()), descField.getText(), mesCombo.getSelectionModel().getSelectedItem());
							
						Banco banco = Main.getBanco();
						banco.addObjeto(doacao);
						new TelaAux("Cadastro Efetuado Com Sucesso!");
						limpaCampos();
			
		
					}catch(NumberFormatException nfe){
						new TelaAux("Valores informados inválidos!");
					}
				}	
			}
			
			private void limpaCampos() {
				valorField.setText(null);
				descField.setText(null);
				mesCombo.getSelectionModel().clearSelection();
				
			}
			
		});
	}
}
