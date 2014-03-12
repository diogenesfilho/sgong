package view;

import banco.Banco;
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
	
	private TextField valorField, mesField;
	private TextArea descField;
	
	public CaDespesaGUI(){
	
		//Criando os objetos

		Label valor = new Label("Valor:");
		Label descri = new Label("Descrição:");
		Label mes = new Label("Mês:");
		
		Label titulo = new Label("Cadastrar Despesa");
		titulo.setFont(new Font(40));
		
		valorField = new TextField();		
		mesField = new TextField();		
		
		descField = new TextArea();
		descField.setPrefSize(400, 100);
		
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
		MeuMenu vboxtop = new MeuMenu(); 

		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(valor, valorField);
			
		HBox hbox2 = new HBox(30);
		hbox2.getChildren().addAll(mes, mesField);
				
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
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
		
		
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			
			
			@Override
			public void handle(ActionEvent event) {
								
				if(valorField.getText().equals("") && mesField.getText().equals("") && descField.getText().equals("")){
					new TelaAux("Informe todos os campos!");
				}else if(valorField.getText().equals("")){
					new TelaAux("Informe o valor.");
				}else if(mesField.getText().equals("")){
					new TelaAux("Informe o mês.");
				}else if(descField.getText().equals("")){
					new TelaAux("Adicione uma descrição.");
				}else{
				
					try{
						
						if(Integer.parseInt(mesField.getText()) > 12 ||Integer.parseInt(mesField.getText()) < 0){
							new TelaAux("M�s Inv�lido!");
						}else{
							Despesa despesa = new Despesa(Double.parseDouble(valorField.getText()),descField.getText(), mesField.getText());
							
							Banco banco = Main.getBanco();
							banco.addObjeto(despesa);
							new TelaAux("Cadastro Efetuado Com Sucesso!");
							limpaCampos();
						}
							
					}catch(NumberFormatException nfe){
						new TelaAux("Valores informados inválidos!");
					}
				}	
			}
			
			private void limpaCampos() {
				valorField.setText(null);
				descField.setText(null);
				mesField.setText(null);
				
			}
		});
	}
}
