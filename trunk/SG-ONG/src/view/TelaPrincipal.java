package view;



import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class TelaPrincipal extends BorderPane {
	public TelaPrincipal(){
		
		
		MeuMenu menu = new MeuMenu();	
	
		ImageView verFundo = new ImageView("/image/telaprinc.png");
		StackPane stack = new StackPane();

		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(menu);


		stack.getChildren().addAll(verFundo,vbox);

		setCenter(stack);
		setTop(vbox);

	}
}
