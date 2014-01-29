package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Doacao;
import app.Main;


public class DoacaoGUI extends BorderPane {
	
	private TextField valorField;
	private TextArea descField;
	
	public DoacaoGUI(){
	
		//Criando os objetos
		Label textoAux = new Label("Caso a doação seja em ITENS, informe 0 e uma descrição.");
		textoAux.setFont(new Font(15));

		Label valor = new Label("Valor:");
		Label descri = new Label("Descrição:");
		
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
			
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(cadastrar,cancelar);
				
		HBox hbox4 = new HBox(30);
		hbox4.getChildren().addAll(descri,descField);
				
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(titulo,hbox1,textoAux,hbox4,hbox3);
				
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
				
		hbox1.setAlignment(Pos.CENTER);
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
				Doacao doacao = new Doacao(Double.parseDouble(valorField.getText()),descField.getText());
				//Após isso talvez uma janela pop-up ou de aviso seja exibida na tela.
				
			}
			
		});
	}
}
