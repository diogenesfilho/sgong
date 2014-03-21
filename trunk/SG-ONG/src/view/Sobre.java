package view;

import java.awt.Label;
import java.awt.TextField;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Sobre extends BorderPane {
	
	private TextField fundoText;
	
	public Sobre(){

		ImageView iconeSobre = new ImageView("/image/info.png");
		Text sobre = new Text("Sobre");
		sobre.setFont(new Font(40));

		HBox titulo = new HBox(35);
		titulo.getChildren().addAll(iconeSobre, sobre);
		
		titulo.setTranslateY(getScaleY()+40);
		titulo.setAlignment(Pos.TOP_CENTER);
		
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/sobre.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,titulo,menu);
		setCenter(stack);
		setTop(menu);

		
	}

}
