package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaAvisoCadastro extends Stage {
	public TelaAvisoCadastro() {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,300,50,Color.LIGHTGRAY);
		
		HBox boxtexto = new HBox();
		
		Label texto = new Label("Cadastrado realizado com sucesso!");
		
        boxtexto.getChildren().addAll(texto);
        boxtexto.setAlignment(Pos.CENTER);
        
        root.setCenter(boxtexto);
		texto.setFont(new Font(15));
		setScene(scene);
		setOpacity(0.9);
		initModality(Modality.APPLICATION_MODAL);//Respons�vel por s� ser poss�vel voltar ao sg ong se fechar a janela.
		show();
		
	}
}
