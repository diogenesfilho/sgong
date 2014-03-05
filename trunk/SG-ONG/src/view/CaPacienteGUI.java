package view;


import javax.swing.JOptionPane;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import banco.Banco;
import model.Paciente;
import app.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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



public class CaPacienteGUI extends BorderPane {
	
	private TextField nomeField, enderecoField,bairroField,nField,cidadeField,rgField,cpfField,
	nasciField,celularField,telefoneField;
	private TextArea observacoesField;
	private ChoiceBox<String> choiceEstado;
	
	public CaPacienteGUI(){
		
		
		//Set Título
		Label titulo = new Label("Cadastrar Paciente");
		titulo.setFont(new Font(30));
		
		MeuMenu menuBar = new MeuMenu();
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label bairroTexto = new Label("Bairro: ");
		Label nTexto = new Label("     Nº: ");
		Label cidadeTexto = new Label("      Cidade: ");
		Label estadoTexto = new Label("      Estado: ");
		Label rgTexto = new Label("RG: ");
		Label cpfTexto = new Label("CPF: ");
		Label nasciTexto = new Label("Data de" +"\n"+ " nascimento: ");
		Label celularTexto = new Label("   Celular: ");
		Label telefoneTexto = new Label("Telefone: ");
		Label observacoesTexto = new Label("Observações: ");

		ObservableList<String>TpEstado = FXCollections.observableArrayList();
		TpEstado.addAll("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		
		choiceEstado = new ChoiceBox<String>();
		choiceEstado.setItems(TpEstado);
		choiceEstado.setPrefSize(200.0, 27.0);
		
		nomeField = new TextField();
		nomeField.setPrefSize(540.0, 27.0);
		
		enderecoField = new TextField();
		enderecoField.setPrefSize(540.0, 27.0);
		
		bairroField = new TextField();
		bairroField.setPrefSize(200.0, 27.0 );
		
		nField = new TextField();
		nField.setPrefSize(150.0, 27.0);
		
		cidadeField = new TextField();
		cidadeField.setPrefSize(150.0, 27.0);
		
		rgField = new TextField();
		rgField.setPrefSize(200.0, 27.0);
		
		cpfField = new TextField();
		cpfField.setPrefSize(150.0, 27.0);
		
		nasciField = new TextField();
		nasciField.setPrefSize(150.0, 27.0);
		
		celularField = new TextField();
		celularField.setPrefSize(150.0, 27.0);
		
		telefoneField = new TextField();
		telefoneField.setPrefSize(200.0, 27.0);		

		observacoesField = new TextArea();
		observacoesField.setPrefSize(350.0, 80.0);

		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
	
		//Conjunto linha 1.
		HBox hbox1 = new HBox(62);
		hbox1.getChildren().addAll(nomeTexto,nomeField);
		
		//Conjunto linha 2.
		HBox hbox2E1 = new HBox(40);
		hbox2E1.getChildren().addAll(enderecoTexto,enderecoField);
		
		HBox hbox2E2 = new HBox(10);
		hbox2E2.getChildren().addAll(bairroTexto,bairroField);
		
		HBox hbox2E3 = new HBox(62);
		hbox2E3.getChildren().addAll(nTexto,nField);
		
		HBox hbox2 = new HBox(55);
		hbox2.getChildren().addAll(hbox2E1,hbox2E2,hbox2E3);
		
		//Conjunto Linha 3.		
		HBox hbox3eE1 = new HBox(62);
		hbox3eE1.getChildren().addAll(bairroTexto,bairroField);
		
		HBox hbox3E2 = new HBox(64);
		hbox3E2.getChildren().addAll(cidadeTexto,cidadeField);
		
		HBox hbox3E3 = new HBox(39);
		hbox3E3.getChildren().addAll(estadoTexto,choiceEstado);

		HBox hbox3 = new HBox(70);
		hbox3.getChildren().addAll(hbox3eE1,hbox3E2,hbox3E3);
		
		//Conjunto Linha 4.
		HBox hbox4E1 = new HBox(81);
		hbox4E1.getChildren().addAll(rgTexto,rgField);
		
		HBox hbox4E2 = new HBox(82);
		hbox4E2.getChildren().addAll(cpfTexto,cpfField);
		
		HBox hbox4E3 = new HBox(5);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox4 = new HBox(97);
		hbox4.getChildren().addAll(hbox4E1,hbox4E2,hbox4E3);
		
		
		//Conjunto linha 5.
		HBox hbox5E1 = new HBox(45);
		hbox5E1.getChildren().addAll(telefoneTexto,telefoneField);
		
		HBox hbox5E2 = new HBox(65);
		hbox5E2.getChildren().addAll(celularTexto,celularField);
		
		HBox hbox5 = new HBox(70);
		hbox5.getChildren().addAll(hbox5E1,hbox5E2);

		
		//Conjunto linha 6.
		HBox hbox6 = new HBox(10);
		hbox6.getChildren().addAll(cadastrar,cancelar);
		
		//Conjunto linha 7
		
		HBox hbox7 = new HBox(20);
		hbox7.getChildren().addAll(observacoesTexto, observacoesField);
		
		// Vboxe's
		VBox vboxTitulo = new VBox(30);
		vboxTitulo.getChildren().addAll(titulo);
		
		VBox vboxAtributos = new VBox(20);
		vboxAtributos.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5,hbox7,hbox6);
		
		VBox vbox = new VBox(40);
		vbox.getChildren().addAll(vboxTitulo,vboxAtributos);
		
		//Sets Alinhamento
		vboxTitulo.setAlignment(Pos.CENTER);
		hbox6.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Distância da borda.
		vbox.setPadding(new Insets(50,100,10,100));
		
		//Setando formulário no centro.
		setCenter(vbox);
		
		// Fundo
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		setCenter(stack);
		setTop(menuBar);
		
		
		//Função Botão cancelar.
		cancelar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
	
		//Função Botão cadastrar.
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
					
			@Override
			public void handle(ActionEvent event) {
				Paciente paciente = new Paciente(nomeField.getText(),enderecoField.getText(),nField.getText(),bairroField.getText(),
						cidadeField.getText(),choiceEstado.getSelectionModel().getSelectedItem(),rgField.getText(),cpfField.getText(),
						nasciField.getText(),celularField.getText(),telefoneField.getText(),observacoesField.getText());
				
				Banco banco = Main.getBanco();
			
				banco.addObjeto(paciente);
				new TelaAvisoCadastro();

				System.out.println(banco.listaPacientes());
				}
		});	
	}
}