package view;

import charts.GrafBar;
import app.Main;
import banco.InfoBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TelaValoresExatos extends BorderPane {
	
	private ListView dados;
	private ObservableList<String> infoBanco;
	private InfoBD banco;
	
	public TelaValoresExatos(){
		
		dados = new ListView<>();
		banco = new InfoBD();
		
		infoBanco = FXCollections.observableArrayList();
		infoBanco.addAll(banco.getQuantidadePacientes(), banco.getQuantidadeSocios(), banco.getQuantidadeDoacoes(), banco.getQuantidadeDespesas());
		dados.setItems(infoBanco);
		
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(dados);
		vbox.setPadding(new Insets(100,300,100,300));
		setCenter(vbox);
		
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/telaprinc.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,vbox);
		setCenter(stack);
		setTop(menu);

		
	}

}