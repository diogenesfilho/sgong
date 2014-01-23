package view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
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
import javafx.stage.Stage;
import app.Main;

public class TelaLoguin extends BorderPane {
	public  TelaLoguin(){
		
		
		Label nome = new Label("Nome");
		Label senha = new Label("Senha");
		TextField textNome = new TextField();
		PasswordField textSenha = new PasswordField();//senha
		Button entrar = new Button("Entrar");
		
		
		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(nome,textNome);
		
		HBox hbox2 = new HBox(30);
		hbox2.getChildren().addAll(senha,textSenha);
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(hbox1,hbox2,entrar);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		Image fundo = new Image("/image/telalogin.png");
		ImageView verFundo = new ImageView(fundo);
		
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);

		setCenter(stack);

		entrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
	}

}
