package view;


import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class TelaPrincipal extends BorderPane {
	public TelaPrincipal(){
		
		
		MeuMenu menu = new MeuMenu();	
		//MenuPrincipalW8 menuW = new MenuPrincipalW8();
	
		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(menu);
		setTop(vbox);
		//setCenter(menuW);
		
	}
}
