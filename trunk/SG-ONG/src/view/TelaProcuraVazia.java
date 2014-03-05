package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TelaProcuraVazia extends Stage {
	public TelaProcuraVazia(){

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,550,50,Color.LINEN);
		
		HBox boxtexto = new HBox();
		
		Label texto = new Label("Não há regsitro!");
		
        boxtexto.getChildren().addAll(texto);
        boxtexto.setAlignment(Pos.CENTER);
        
        root.setCenter(boxtexto);
		texto.setFont(new Font(20));
		setScene(scene);
		setOpacity(0.9);
		show();
		
	}
}
