package view;

import banco.Banco;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Despesa;
import app.Main;

public class DespesaGUI extends BorderPane {
	
	private TextField valorField ;
	private TextArea descField;
	
	public DespesaGUI(){
		
		Label valor = new Label("Valor:");
		Label descri = new Label("Descrição:");
		
		Label titulo = new Label("Cadastrar Despesa");
		titulo.setFont(new Font(40));
		
		valorField = new TextField();
		descField = new TextArea();
		descField.setPrefSize(400, 100);
		
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
		MeuMenu vboxtop = new MeuMenu(); 

		HBox hbox1 = new HBox(30);
		hbox1.getChildren().addAll(valor,valorField);
			
		HBox hbox3 = new HBox(30);
		hbox3.getChildren().addAll(cadastrar,cancelar);
				
		HBox hbox4 = new HBox(30);
		hbox4.getChildren().addAll(descri,descField);
				
		VBox vbox = new VBox(30);
				vbox.getChildren().addAll(titulo,hbox1,hbox4,hbox3);
				
		VBox vboxP = new VBox(30);
		vboxP.getChildren().addAll(vbox,vboxtop);
				
		hbox1.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		hbox4.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
				
		vbox.setPadding(new Insets(10,100,10,100));
				
		setCenter(vbox);

		
		//Background
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		
		setCenter(stack);
		setTop(vboxtop);     //Setando menuBar sempre no topo
				
		cancelar.setOnAction(new EventHandler<ActionEvent>() {
					
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Main.mudarTela(new TelaPrincipal());
						
			}
		});
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Despesa despesa  = new Despesa(Double.parseDouble(valorField.getText()),descField.getText());
				
				Banco banco = Main.getBanco();
				
				banco.addObjeto(despesa);
				new TelaAux("Despesa Cadastrada Com Sucesso!");
				limpaCampos();
				

				System.out.println(banco.listaObjeto(Despesa.class));
				}

			private void limpaCampos() {
				valorField.setText(null);
				descField.setText(null);
				
			}
	
		});
	}
}