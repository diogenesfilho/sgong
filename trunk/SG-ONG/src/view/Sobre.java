package view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Sobre extends BorderPane {
	
	public Sobre(){
		
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/sobre.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,menu);
		setCenter(stack);
		setTop(menu);

		
	}

}
