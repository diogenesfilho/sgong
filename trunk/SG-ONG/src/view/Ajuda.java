package view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class Ajuda extends BorderPane {
	
	public Ajuda(){
		
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/ajuda.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,menu);
		setCenter(stack);
		setTop(menu);

		
	}

}
