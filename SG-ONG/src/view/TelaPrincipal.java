package view;



import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class TelaPrincipal extends BorderPane {
	public TelaPrincipal(){
		
		
		MeuMenu menu = new MeuMenu();	
		//MenuPrincipalW8 menuW = new MenuPrincipalW8();
	
		ImageView verFundo = new ImageView("/image/telaprinc.png");
		StackPane stack = new StackPane();

		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(menu);


		stack.getChildren().addAll(verFundo,vbox);

		setCenter(stack);
		setTop(vbox); // Tem que ser declarado aqui que ficará no top senão será sobreposto ou ficar com aparência não desejada.

		//setCenter(menuW);
		
	}
}
