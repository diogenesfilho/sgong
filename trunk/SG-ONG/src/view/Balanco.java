package view;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;

import app.Main;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class Balanco extends BorderPane {
	
	public Balanco(){
		
		Button doacoes = new Button("Doações");
	    Button despesas = new Button("Despesas");
	    Button grafico = new Button("Gráfico");
	    Button infoGeral = new Button("Informações Gerais");
	    
	    ToolBar toolbar = new ToolBar();
	    toolbar.getItems().add(doacoes);
	    toolbar.getItems().add(despesas);
	    toolbar.getItems().add(grafico);
	    toolbar.getItems().add(infoGeral);
	    
	  
	    
		HBox barra = new HBox(20);
		barra.getChildren().addAll(toolbar);
		barra.setAlignment(Pos.TOP_CENTER);
	    
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/telaprinc.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,menu,barra);
		setCenter(stack);
		setTop(menu);

		
	}

}
