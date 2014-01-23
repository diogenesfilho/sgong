package view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Socio;



public class CadastroSocio extends BorderPane {
	public CadastroSocio(){
		
		//Set Título futura imagem.
		Label titulo = new Label("Cadastrar Sócio");
		titulo.setFont(new Font(20));
		
		
		MeuMenu vboxtop = new MeuMenu(); //Warning!
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label bairroTexto = new Label("Bairro: ");
		Label nTexto = new Label("Nº.");
		
		Label cidadeTexto = new Label("Cidade: ");
		cidadeTexto.setAlignment(Pos.CENTER_RIGHT);
		
		Label estadoTexto = new Label("Estado: ");
		Label rgTexto = new Label("RG: ");
		
		Label cpfTexto = new Label("CPF: ");
		cpfTexto.setAlignment(Pos.CENTER_RIGHT);
		
		Label nasciTexto = new Label("Nascimento: ");
		
		Label celularTexto = new Label("Celular: ");
		celularTexto.setAlignment(Pos.CENTER_RIGHT);
		
		Label telefoneTexto = new Label("Telefone: ");
		Label compleTexto = new Label("Complemento: ");
		Label dataFiliTexto = new Label("Data Filiacão: ");
		Label emailTexto = new Label("Email: ");
		Label tipoSocioTexto = new Label("Tipo de Sócio: ");//Olhar.
		
		Label valorArreTexto = new Label("Valor arrecadação: ");
		valorArreTexto.setAlignment(Pos.CENTER_RIGHT);
		
		Label dataArrecaTexto = new Label("Data Arrecadação: ");
		Label profissaoTexto = new Label("Profissão: ");
		profissaoTexto.setAlignment(Pos.CENTER_LEFT);
		
		
		/*String fulaninho = nomeField.getText();//Pega o texto para string.
		Pessoa Danilinho = new Pessoa();
		Danilinho.setNome(fulaninho);*/
		
		TextField nomeField = new TextField();
		nomeField.setPrefSize(700.0, 27.0);
		
		TextField enderecoField = new TextField();
		enderecoField.setPrefSize(540.0, 27.0);
		
		TextField bairroField = new TextField();
		bairroField.setPrefSize(200.0, 27.0 );
		
		TextField nField = new TextField();
		nField.setPrefSize(170.0, 27.0);
		
		TextField cidadeField = new TextField();
		cidadeField.setPrefSize(170.0, 27.0);
		
		TextField estadoField = new TextField();
		estadoField.setPrefSize(170.0, 27.0);
		
		TextField rgField = new TextField();
		rgField.setPrefSize(200.0, 27.0);
		
		TextField cpfField = new TextField();
		cpfField.setPrefSize(170.0, 27.0);
		
		TextField nasciField = new TextField();
		nasciField.setPrefSize(170.0, 27.0);
		
		TextField celularField = new TextField();
		celularField.setPrefSize(170.0, 27.0);
		
		TextField telefoneField = new TextField();
		telefoneField.setPrefSize(200.0, 27.0);
		
		TextArea compleArea = new TextArea();
		
		
		TextField dataFiliField = new TextField();
		dataFiliField.setPrefSize(200.0, 27.0);
		
		TextField emailField = new TextField();
		emailField.setPrefSize(170.0, 27.0);
		
		TextField tipoSocioField = new TextField();
		tipoSocioField.setPrefSize(200.0, 27.0);
		
		TextField valorArreField = new TextField();
		valorArreField.setPrefSize(170.0, 27.0);
		
		TextField dataArreField = new TextField();
		dataArreField.setPrefSize(170.0, 27.0);
		
		TextField profissaoField = new TextField();
		profissaoField.setPrefSize(170.0, 27.0);
		
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
		
		//Será função após cadastar.
		/*Socio socio = new Socio(nomeField.getText(),
				enderecoField.getText(), 
				bairroField.getText(), 
				cidadeField.getText(), 
				estadoField.getText(),
				rgField.getText(), 
				cpfField.getText(), 
				nasciField.getText(),
				celularField.getText(), 
				telefoneField.getText(), 
				compleArea.getText(), 
				dataFiliField.getText(), 
				emailField.getText(),
				tipoSocioField.getText(), 
				dataArreField.getText(), 
				profissaoField.getText(),
				Double.parseDouble(valorArreField.getText()));*/
		
	
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
		
		HBox hbox3E2 = new HBox(45);
		hbox3E2.getChildren().addAll(cidadeTexto,cidadeField);
		
		HBox hbox3E3 = new HBox(61);
		hbox3E3.getChildren().addAll(estadoTexto,estadoField);

		HBox hbox3 = new HBox(70);
		hbox3.getChildren().addAll(hbox3eE1,hbox3E2,hbox3E3);
		
		//Conjunto Linha 4.
		HBox hbox4E1 = new HBox(81);
		hbox4E1.getChildren().addAll(rgTexto,rgField);
		
		HBox hbox4E2 = new HBox(38);
		hbox4E2.getChildren().addAll(cpfTexto,cpfField);
		
		HBox hbox4E3 = new HBox(5);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox4 = new HBox(97);
		hbox4.getChildren().addAll(hbox4E1,hbox4E2,hbox4E3);
		
		
		//Conjunto linha 5.
		HBox hbox5E1 = new HBox(45);
		hbox5E1.getChildren().addAll(telefoneTexto,telefoneField);
		
		HBox hbox5E2 = new HBox(30);
		hbox5E2.getChildren().addAll(celularTexto,celularField);
		
		HBox hbox5E3 = new HBox(60);
		hbox5E3.getChildren().addAll(emailTexto,emailField);
		
		HBox hbox5 = new HBox(82);
		hbox5.getChildren().addAll(hbox5E1,hbox5E2,hbox5E3);
		
		//Conjunto linha 6.
		HBox hbox6E1 = new HBox(15);
		hbox6E1.getChildren().addAll(tipoSocioTexto,tipoSocioField);
		
		HBox hbox6E2 = new HBox(10);
		hbox6E2.getChildren().addAll(valorArreTexto,valorArreField);

		HBox hbox6E3 = new HBox(30);
		hbox6E3.getChildren().addAll(dataArrecaTexto,dataArreField);
		
		HBox hbox6 = new HBox(30);
		hbox6.getChildren().addAll(hbox6E1,hbox6E2,hbox6E3);
	
		//Conjunto linha 7.
		HBox hbox7E1 = new HBox(16);
		hbox7E1.getChildren().addAll(dataFiliTexto,dataFiliField);
		
		HBox hbox7E2 = new HBox(50);
		hbox7E2.getChildren().addAll(profissaoTexto,profissaoField);
		
		HBox hbox7 = new HBox(50);
		hbox7.getChildren().addAll(hbox7E1,hbox7E2);
		
		//Conjunto linha 8.
		HBox hbox8 = new HBox(10);
		hbox8.getChildren().addAll(compleTexto,compleArea);
		
		//Conjunto linha 9.
		HBox hbox9 = new HBox(10);
		hbox9.getChildren().addAll(cadastrar,cancelar);
		
		
		VBox vboxTitulo = new VBox(10);
		vboxTitulo.getChildren().addAll(titulo);
		
		VBox vbox = new VBox(15);
		vbox.getChildren().addAll(vboxTitulo,hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,hbox8,hbox9);
		
		//Sets Alig..
		vboxTitulo.setAlignment(Pos.CENTER);
		hbox9.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Distância da borda.
		vbox.setPadding(new Insets(10,100,10,100));
		
		
		setCenter(vbox);
		setTop(vboxtop);//Setando menuBar sempre no topo.
		
	}
}
