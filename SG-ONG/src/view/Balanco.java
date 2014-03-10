package view;


import app.Main;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class Balanco extends BorderPane {
	
	private Button doacoes, despesas, grafico, infoGeral, x;
	
	public Balanco(){
		
		doacoes = new Button("Doações");
	    despesas = new Button("Despesas");
	    grafico = new Button("Gráfico");
	    infoGeral = new Button("Informações Gerais");
	    
	    ToolBar toolbar = new ToolBar(
	    		doacoes, despesas, grafico, infoGeral);
	    
	    toolbar.setMinSize(1240, 60);
	    
	    x = new Button("x");
	    
	    
	    
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
