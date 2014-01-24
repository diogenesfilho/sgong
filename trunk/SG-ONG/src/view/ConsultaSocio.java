package view;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConsultaSocio extends BorderPane {
	
	public ConsultaSocio(){
		
		MeuMenu menuBar = new MeuMenu();
		
		Label titulo = new Label("Procurar Sócio");
		titulo.setFont(new Font(20));
		
		Label procuraNome = new Label("Procurar por nome:");
		TextField procuraField = new TextField();
		procuraField.setPrefSize(620.0, 27.0); 
		Button procurar = new Button("Procurar");
		
		HBox hbox = new HBox(20);
		hbox.getChildren().addAll(procuraNome,procuraField,procurar);
		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(menuBar,titulo,hbox);
		
		
		hbox.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);

		// Fundo
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);

		setCenter(stack);
		setTop(vbox);


		
	}

}
