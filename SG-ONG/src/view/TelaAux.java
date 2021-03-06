package view;


/**
 * 
 * Deverá ser passado como paramêtro a mensagem a ser passada na janela.
 * @param String
 * 
 */


import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;
import banco.Banco;
import app.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaAux extends Stage {
	
	private String mensagem;
	
	public TelaAux(String mensagem){
		this.mensagem = mensagem;

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,450,80,Color.LIGHTGRAY);
		
		VBox boxtexto = new VBox(10);
		
		Label texto = new Label(getMensagem());
		Button ok = new Button("OK");
		ok.setStyle("-fx-cursor: hand;");
		
        boxtexto.getChildren().addAll(texto,ok);
        boxtexto.setAlignment(Pos.CENTER);
        
        root.setCenter(boxtexto);
		texto.setFont(new Font(15));
		setScene(scene);
		setOpacity(0.9);
		initModality(Modality.APPLICATION_MODAL); //Responsável por só ser possível voltar ao sg ong se fechar a janela.
		show();
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				close();
			}
		});
		
	}
	
	public TelaAux(final Object o, String confirmacao, final TableView tabela){
		this.mensagem = confirmacao;
		final Banco banco = Main.getBanco();
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,450,60,Color.LIGHTGRAY);
		
		Label texto = new Label(getMensagem());
		Button sim = new Button("Sim");
		Button nao = new Button("Não");
		
		VBox boxtexto = new VBox(10);
		HBox opcoes = new HBox(10);
		
		opcoes.getChildren().addAll(sim, nao);
        boxtexto.getChildren().addAll(texto,opcoes);
        
        boxtexto.setAlignment(Pos.CENTER);
        opcoes.setAlignment(Pos.CENTER);
        
        root.setCenter(boxtexto);
		texto.setFont(new Font(15));
		setScene(scene);
		setOpacity(0.9);
		initModality(Modality.APPLICATION_MODAL); //Responsável por só ser possível voltar ao sg ong se fechar a janela.
		show();
		
		nao.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				close();
			}
		});
		
		
		sim.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {				
				close();
				banco.excluirObjeto(o);
				
				String classe = o.getClass().toString();
				
				if (classe.equals("class model.Paciente")) {
					ObservableList<Paciente>listaPacientesRefresh = FXCollections.observableArrayList(banco.listarPacientes());
					tabela.setItems(listaPacientesRefresh);
				}
				
				else if (classe.equals("class model.Socio")) {
					ObservableList<Socio>listaSociosRefresh = FXCollections.observableArrayList(banco.listarSocios());
					tabela.setItems(listaSociosRefresh);
				}
				
				else if (classe.equals("class model.Doacao")) {
					ObservableList<Doacao>listaDoacoesRefresh = FXCollections.observableArrayList(banco.listarDoacoes());
					tabela.setItems(listaDoacoesRefresh);
				}
				
				else if (classe.equals("class model.Despesa")) {
					ObservableList<Despesa>listaDespesasRefresh = FXCollections.observableArrayList(banco.listarDespesas());
					tabela.setItems(listaDespesasRefresh);
				}
				
			}
		});
	}
	

	public String getMensagem() {
		return mensagem;
	}
	
}
