package view;

import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class DoacaoItem extends BorderPane {
	public DoacaoItem(){
	
		//Criando os objetos.
		Label itensQ = new Label("Quantidade de Itens: ");
		Label descri = new Label("Descrição:");
		
		Label titulo = new Label("Cadastrar Doação");
		titulo.setFont(new Font(50));
		
		TextField textoQuant = new TextField();
		TextArea descricao = new TextArea();
		Button cadastrar = new Button("Cadastrar");
		Button voltar = new Button("Voltar");
		MeuMenu vboxtop = new MeuMenu();

		
		//Jutando elementos na horizontal.
		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(itensQ,textoQuant);
		
		HBox hbox2 = new HBox(30);
		hbox2.getChildren().addAll(cadastrar,voltar);
		
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(descri,descricao);
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(titulo,hbox1,hbox3,hbox2);
		
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
		

		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		vbox.setPadding(new Insets(10,100,10,100));
		
		setCenter(vbox);
		setTop(vboxtop);
		
		voltar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
	}
}
