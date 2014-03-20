package view;

import java.awt.Color;
import java.awt.Label;

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

public class TelaInfoGerais extends BorderPane {
	
	private ListView dados;
	private ObservableList<String> infoBanco;
	private InfoBD banco;
	
	public TelaInfoGerais(){
		
		dados = new ListView<>();
		banco = new InfoBD();
		banco.compoeDoacoes();banco.compoeDespesas();
		
			
		infoBanco = FXCollections.observableArrayList();
		infoBanco.addAll("Pacientes Cadastrados: " + banco.getQuantidadePacientes(), "Sócios cadastrados: " + banco.getQuantidadeSocios(),"Doações cadastradas: " +  banco.getQuantidadeDoacoes(),"Despesas cadastradas: " + banco.getQuantidadeDespesas(), "",
				"Total de arrecadações: R$ " + banco.geraArrecadacoes(), "Total de Despesas: R$ " + banco.geraGastos(), "Saldo da ONG: R$ " + banco.geraSaldo());
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