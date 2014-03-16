package view;



import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

import banco.Banco;
import banco.InfoBD;
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
import javafx.scene.control.ComboBox;
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
	
	private TextField nomeField, enderecoField,cidadeField,rgField,cpfField,
	nasciField,telefoneCelularField;
	private TextArea observacoesField;
	private ComboBox<String> comboEstado;
	private ObservableList<String> TpEstado;
	private Button cadastrar, cancelar;
	
	public CaPacienteGUI() throws ParseException{
		
		//Set Título
		Label titulo = new Label("Cadastrar Paciente");
		titulo.setFont(new Font(30));
		
		MeuMenu menuBar = new MeuMenu();
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label cidadeTexto = new Label("Cidade: ");
		Label estadoTexto = new Label("Estado: ");
		Label rgTexto = new Label("RG: ");
		Label cpfTexto = new Label("CPF: ");
		Label nasciTexto = new Label("Data de" +"\n"+ " nascimento: ");
		Label telefoneCelularTexto = new Label("Telefone/Celular: ");
		Label observacoesTexto = new Label("Observações: ");

		TpEstado = FXCollections.observableArrayList();
		TpEstado.addAll("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		
		comboEstado = new ComboBox<String>();
		comboEstado.setItems(TpEstado);
		comboEstado.setPrefSize(200.0, 27.0);
		
		nomeField = new TextField();
		nomeField.setPrefSize(560.0, 27.0);
		
		enderecoField = new TextField();
		enderecoField.setPrefSize(560.0, 27.0);
		
		cidadeField = new TextField();
		cidadeField.setPrefSize(200.0, 27.0);
		
		rgField = new TextField();
		rgField.setPrefSize(200.0, 27.0);
		
		cpfField = new TextField();
		cpfField.setPrefSize(200.0, 27.0);
		
		nasciField = new TextField();
		nasciField.setPrefSize(200.0, 27.0);
		
		telefoneCelularField = new TextField();
		telefoneCelularField.setPrefSize(200.0, 27.0);		

		observacoesField = new TextArea();
		observacoesField.setPrefSize(350.0, 80.0);

		cadastrar = new Button("Cadastrar");
		cancelar = new Button("Cancelar");
		
		
		//Conjunto linha 1.
		HBox hbox1 = new HBox(62);
		hbox1.getChildren().addAll(nomeTexto,nomeField);
		
		//Conjunto linha 2.
		HBox hbox2E1 = new HBox(40);
		hbox2E1.getChildren().addAll(enderecoTexto,enderecoField);
		
		
		//Conjunto Linha 3.
		
		HBox hbox3E2 = new HBox(55);
		hbox3E2.getChildren().addAll(cidadeTexto,cidadeField);
		
		HBox hbox3E3 = new HBox(75);
		hbox3E3.getChildren().addAll(estadoTexto,comboEstado);

		HBox hbox3 = new HBox(70);
		hbox3.getChildren().addAll(hbox3E2,hbox3E3);
		
		//Conjunto Linha 4.
		HBox hbox4E1 = new HBox(81);
		hbox4E1.getChildren().addAll(rgTexto,rgField);
		
		HBox hbox4E2 = new HBox(95);
		hbox4E2.getChildren().addAll(cpfTexto,cpfField);
		
		HBox hbox4 = new HBox(70);
		hbox4.getChildren().addAll(hbox4E1,hbox4E2);
		
		//Conjunto linha 5.
		HBox hbox5E1 = new HBox(5);
		hbox5E1.getChildren().addAll(telefoneCelularTexto,telefoneCelularField);
		
		HBox hbox4E3 = new HBox(40);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox5 = new HBox(58);
		hbox5.getChildren().addAll(hbox5E1, hbox4E3);

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
		vboxAtributos.getChildren().addAll(hbox1,hbox2E1,hbox3,hbox4,hbox5,hbox7,hbox6);
		
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
	
				
				try {
					
					if(nomeField.getText().toString().isEmpty() || comboEstado.getSelectionModel().getSelectedItem() == null || cpfField.getText().toString().isEmpty()  || rgField.getText().toString().isEmpty() || cidadeField.getText().toString().isEmpty() || nasciField.getText().toString().isEmpty()){
						new TelaAux("Por Favor informe todos os dados!");
//					}else if (cidade.contains(s)) {
//						new TelaAux("Cidade inválida!");   // PAREI AQUI
//					} else{
						Paciente paciente;
						paciente = new Paciente(nomeField.getText(),enderecoField.getText(),cidadeField.getText(),comboEstado.getSelectionModel().getSelectedItem(),rgField.getText(),cpfField.getText(),nasciField.getText(),telefoneCelularField.getText(),observacoesField.getText());
								
						Banco banco = Main.getBanco();
						banco.addObjeto(paciente);
						new TelaAux("Paciente Cadastrado Com Sucesso!");
						limpaCampos();
					}
				} catch (NumberFormatException nfe) {
					new TelaAux("Dados inválidos!");
				}
				

			}
			
			public void limpaCampos(){
				nomeField.setText(null);enderecoField.setText(null);cidadeField.setText(null);
				rgField.setText(null);cpfField.setText(null);nasciField.setText(null);
				observacoesField.setText(null);telefoneCelularField.setText(null);comboEstado.getSelectionModel().clearSelection();
			}
		});	
	}
}