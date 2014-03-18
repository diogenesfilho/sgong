package view;


import javax.swing.JOptionPane;

import banco.Banco;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Paciente;
import model.Socio;
import app.Main;


public class CaSocioGUI extends BorderPane {
	
	private TextField nomeField,enderecoField,cidadeField,rgField,cpfField,
	nasciField,telefoneCelularField,dataFiliacaoField,emailField;
	private ComboBox<String> comboSocio, comboEstado;
	private ObservableList<String> TpEstado, TpSocio;
	private Button cadastrar, cancelar;
	private Banco banco;
	
	public CaSocioGUI(){
		
		//Localizando banco
		banco = Main.getBanco();
		
		//Set Título
		Label titulo = new Label("Cadastrar Sócio");
		titulo.setFont(new Font(30));
		
		MeuMenu menuBar = new MeuMenu(); 
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label cidadeTexto = new Label("Cidade: ");	
		Label estadoTexto = new Label("Estado: ");
		Label rgTexto = new Label("RG: ");
		Label cpfTexto = new Label("CPF: ");
		Label nasciTexto = new Label("Data de" +"\n"+ " nascimento: ");
		Label telefoneCelularTexto = new Label("Telefone: ");
		Label emailTexto = new Label("Email: ");
		Label tipoSocioTexto = new Label("Tipo de Sócio: ");
		Label dataFiliacaoTexto = new Label("Data de Filiação: ");
			
		TpSocio = FXCollections.observableArrayList();
		TpSocio.addAll("Contribuinte","Voluntário");
		
		TpEstado = FXCollections.observableArrayList();
		TpEstado.addAll("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		
		comboSocio = new ComboBox<String>();
		comboSocio.setItems(TpSocio);
		comboSocio.setPrefSize(200.0, 27.0);
		
		comboEstado = new ComboBox<String>();
		comboEstado.setItems(TpEstado);
		comboEstado.setPrefSize(200.0, 27.0);
		
		nomeField = new TextField();
		nomeField.setPrefSize(560.0, 27.0);
		nomeField.setPromptText("Ex.: José Antônio da Silva");
		
		enderecoField = new TextField();
		enderecoField.setPrefSize(560.0, 27.0);
		enderecoField.setPromptText("Rua, Bairro, Número");
		
		cidadeField = new TextField();
		cidadeField.setPrefSize(200.0, 27.0);
		cidadeField.setPromptText("Ex.: Arapiraca");
		
		rgField = new TextField();
		rgField.setPrefSize(200.0, 27.0);
		rgField.setPromptText("Ex.: 34521445");
		
		cpfField = new TextField();
		cpfField.setPrefSize(200.0, 27.0);
		cpfField.setPromptText("Ex.: 09716948421");
		
		nasciField = new TextField();
		nasciField.setPrefSize(200.0, 27.0);
		nasciField.setPromptText("Ex.: 040979");

		telefoneCelularField = new TextField();
		telefoneCelularField.setPrefSize(200.0, 27.0);
		telefoneCelularField.setPromptText("Ex.: 99685213");
		
		dataFiliacaoField = new TextField();
		dataFiliacaoField.setPrefSize(200.0, 27.0);
		dataFiliacaoField.setPromptText("Ex.: 010314");
		
		emailField = new TextField();
		emailField.setPrefSize(200.0, 27.0);
		emailField.setPromptText("Ex.: jose@gmail.com");
		
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
		HBox hbox5E1 = new HBox(45);
		hbox5E1.getChildren().addAll(telefoneCelularTexto,telefoneCelularField);
		
		HBox hbox4E3 = new HBox(40);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox5 = new HBox(70);
		hbox5.getChildren().addAll(hbox5E1, hbox4E3);

		//Conjunto linha 6
		HBox hbox6E1 = new HBox(20);
		hbox6E1.getChildren().addAll(tipoSocioTexto, comboSocio);
		
		HBox hbox6 = new HBox(20);
		hbox6.getChildren().addAll(hbox6E1);
		
		//Conjunto linha 7
		HBox hbox7E1 = new HBox(5);
		hbox7E1.getChildren().addAll(dataFiliacaoTexto, dataFiliacaoField);
		
		HBox hbox7E2 = new HBox(85);
		hbox7E2.getChildren().addAll(emailTexto, emailField);
		
		HBox hbox7 = new HBox(60);
		hbox7.getChildren().addAll(hbox7E1, hbox7E2);
		
		//Conjunto botoes
		HBox hboxBotoes = new HBox(10);
		hboxBotoes.getChildren().addAll(cadastrar,cancelar);
				
		// Vboxe's
		VBox vboxTitulo = new VBox(30);
		vboxTitulo.getChildren().addAll(titulo);
		
		VBox vboxAtributos = new VBox(20);
		vboxAtributos.getChildren().addAll(hbox1,hbox2E1,hbox3,hbox4,hbox5,hbox7,hbox6,hboxBotoes);
		
		VBox vbox = new VBox(40);
		vbox.getChildren().addAll(vboxTitulo,vboxAtributos);
		
		//Sets Alinhamento
		vboxTitulo.setAlignment(Pos.CENTER);
		hboxBotoes.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Distância da borda.
		vbox.setPadding(new Insets(50,100,10,100));
		
		//Setando elementos do formulário no Centro.
		setCenter(vbox);

		
		// Fundo
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		setCenter(stack);
		setTop(menuBar);     //Setando menuBar sempre no topo.
		
		//Função Botão cancelar
		cancelar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				try {
					if(nomeField.getText().toString().isEmpty() || enderecoField.getText().toString().isEmpty() || comboEstado.getSelectionModel().getSelectedItem() == null || comboSocio.getSelectionModel().getSelectedItem() == null || cpfField.getText().toString().isEmpty()  || rgField.getText().toString().isEmpty() || cidadeField.getText().toString().isEmpty() || nasciField.getText().toString().isEmpty() || dataFiliacaoField.getText().toString().isEmpty() ){
						new TelaAux("Dados inválidos");
					}else if (8 > rgField.getText().length() || cpfField.getText().length() != 11 || telefoneCelularField.getText(). length() != 8 || nasciField.getText().length() != 6  || dataFiliacaoField.getText().length() != 6) {
						new TelaAux("Dados inválidos, siga o exemplo de cada campo!");
					} else if (!banco.verificaCpfSocios(cpfField.getText())) {
						new TelaAux("Já existe um sócio com este CPF!");
					}
					else{
		
						double rg = Double.parseDouble(rgField.getText());
						double cpf = Double.parseDouble(cpfField.getText());
						double tel = Double.parseDouble(telefoneCelularField.getText());
						double dataNasc = Double.parseDouble(nasciField.getText());
						double dataFili = Double.parseDouble(dataFiliacaoField.getText());
						
						Socio socio = new Socio(nomeField.getText(), enderecoField.getText(), cidadeField.getText(), comboEstado.getSelectionModel().getSelectedItem(), rgField.getText(), cpfField.getText(), nasciField.getText(), telefoneCelularField.getText(), comboSocio.getSelectionModel().getSelectedItem(), dataFiliacaoField.getText(), emailField.getText());
						banco.addObjeto(socio);
						new TelaAux("Sócio Cadastrado Com Sucesso!");
						limpaCampos();
					}
					} catch (Exception e) {
						new TelaAux("Nos campos de RG, CPF, telefone"+"\n"+"e datas digite apenas números!");
					}
				}


			private void limpaCampos() {
				nomeField.setText(null);enderecoField.setText(null);cidadeField.setText(null);rgField.setText(null);
				cpfField.setText(null);nasciField.setText(null);emailField.setText(null);
				telefoneCelularField.setText(null);dataFiliacaoField.setText(null);comboEstado.getSelectionModel().clearSelection();
				comboSocio.getSelectionModel().clearSelection();
			}
			
		});
	}
}