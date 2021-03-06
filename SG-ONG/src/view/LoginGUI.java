package view;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import app.Main;

public class LoginGUI extends BorderPane {
	
	public  LoginGUI(){
		
		//Deixando o cursor sem focar, inicialmente, em nenhum campo
		setFocusTraversable(true);
		
		Label nome = new Label("Usuário:");		
		Label senha = new Label("Senha:");
		
		final TextField nomeField = new TextField();
		nomeField.setPromptText("Digite seu login");
		
		final PasswordField senhaField = new PasswordField();
		senhaField.setPromptText("Digite sua senha");
		
		Image icone = new Image(getClass().getResourceAsStream("/image/login.png"));
		Button entrar = new Button("Entrar", new ImageView(icone));

		HBox hbox1 = new HBox(35);
		hbox1.getChildren().addAll(nome,nomeField);
		
		HBox hbox2 = new HBox(40);
		hbox2.getChildren().addAll(senha,senhaField);
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(hbox1,hbox2,entrar);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(200,10,10,10));
		
		// Fundo
		Image fundo = new Image("/image/telalogin.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		stack.setPadding(new Insets(100,10,10,10));
		setCenter(stack);

		entrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if (nomeField.getText().equals("adm") &&  (senhaField.getText().equals("adm"))){
					getScene().setRoot(new TelaPrincipal());
				}else if(nomeField.getText().equals("") || senhaField.getText().equals("")){
					new TelaAux("Digite login e senha!");
				}
				else {
					new TelaAux("Usuário não permitido!");
				}
			}
		});
	}
}
