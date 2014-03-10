package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaAux extends Stage {
	
	private String mensagem;
	
	public TelaAux(String mensagem){
		this.mensagem = mensagem;

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,450,60,Color.LIGHTGRAY);
		
		VBox boxtexto = new VBox(10);
		
		Label texto = new Label(getMensagem());
		Button ok = new Button("OK");
		
        boxtexto.getChildren().addAll(texto,ok);
        boxtexto.setAlignment(Pos.CENTER);
        
        root.setCenter(boxtexto);
		texto.setFont(new Font(15));
		setScene(scene);
		setOpacity(0.9);
		initModality(Modality.APPLICATION_MODAL); //Respons�vel por s� ser poss�vel voltar ao sg ong se fechar a janela.
		show();
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				//Comando pra fechar este cabrumco.
			}
		});
		
	}

	public String getMensagem() {
		return mensagem;
	}
	
}
