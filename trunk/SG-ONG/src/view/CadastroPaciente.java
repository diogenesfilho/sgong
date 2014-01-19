package view;

import javax.swing.JTextField;

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



public class CadastroPaciente extends BorderPane {
	public CadastroPaciente(){
		
		//Set Título futura imagem.
		Label titulo = new Label("Cadastrar Paciente");
		titulo.setFont(new Font(20));
		
		MeuMenu vboxtop = new MeuMenu(); //Warning!
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label bairroTexto = new Label("Bairro: ");
		Label nTexto = new Label("Nº.");
		Label cidadeTexto = new Label("Cidade: ");
		Label estadoTexto = new Label("Estado: ");
		Label rgTexto = new Label("RG: ");
		Label cpfTexto = new Label("CPF: ");
		Label nasciTexto = new Label("Nascimento: ");
		Label celularTexto = new Label("Celular: ");
		Label telefoneTexto = new Label("Telefone: ");
		Label compleTexto = new Label("Complemento: ");
		Label profissaoTexto = new Label("Profissão: ");
		
		
		/*String fulaninho = nomeField.getText();//Pega o texto para string.
		Pessoa Danilinho = new Pessoa();
		Danilinho.setNome(fulaninho);*/
		
		TextField nomeField = new TextField();
		nomeField.setPrefSize(700.0, 25.0);
		TextField enderecoField = new TextField();
		enderecoField.setPrefSize(500.0, 25.0);
		TextField bairroField = new TextField();
		TextField nField = new TextField();
		TextField cidadeField = new TextField();
		TextField estadoField = new TextField();
		TextField rgField = new TextField();
		TextField cpfField = new TextField();
		TextField nasciField = new TextField();
		TextField celularField = new TextField();
		TextField telefoneField = new TextField();
		TextArea compleArea = new TextArea();
		TextField dataFiliField = new TextField();
		TextField emailField = new TextField();
		TextField tipoSocioField = new TextField();
		TextField valorArreField = new TextField();
		TextField dataArreField = new TextField();
		TextField profissaoField = new TextField();
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
		
	
		//Conjunto linha 1.
		HBox hbox1 = new HBox(35);
		hbox1.getChildren().addAll(nomeTexto,nomeField);
		
		//Conjunto linha 2.
		HBox hbox2E1 = new HBox(10);
		hbox2E1.getChildren().addAll(enderecoTexto,enderecoField);
		
		HBox hbox2E2 = new HBox(10);
		hbox2E2.getChildren().addAll(bairroTexto,bairroField);
		
		HBox hbox2E3 = new HBox(10);
		hbox2E3.getChildren().addAll(nTexto,nField);
		
		HBox hbox2 = new HBox(55);
		hbox2.getChildren().addAll(hbox2E1,hbox2E2,hbox2E3);
		
		//Conjunto Linha 3.		
		HBox hbox3eE1 = new HBox(25);
		hbox3eE1.getChildren().addAll(bairroTexto,bairroField);
		
		HBox hbox3E2 = new HBox(10);
		hbox3E2.getChildren().addAll(cidadeTexto,cidadeField);
		
		HBox hbox3E3 = new HBox(10);
		hbox3E3.getChildren().addAll(estadoTexto,estadoField);

		HBox hbox3 = new HBox(70);
		hbox3.getChildren().addAll(hbox3eE1,hbox3E2,hbox3E3);
		
		//Conjunto Linha 4.
		HBox hbox4E1 = new HBox(35);
		hbox4E1.getChildren().addAll(rgTexto,rgField);
		
		HBox hbox4E2 = new HBox(20);
		hbox4E2.getChildren().addAll(cpfTexto,cpfField);
		
		HBox hbox4E3 = new HBox(10);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox4 = new HBox(97);
		hbox4.getChildren().addAll(hbox4E1,hbox4E2,hbox4E3);
		
		
		//Conjunto linha 5.
		HBox hbox5E1 = new HBox(10);
		hbox5E1.getChildren().addAll(telefoneTexto,telefoneField);
		
		HBox hbox5E2 = new HBox(10);
		hbox5E2.getChildren().addAll(celularTexto,celularField);
		
		HBox hbox5 = new HBox(82);
		hbox5.getChildren().addAll(hbox5E1,hbox5E2);
	
		//Conjunto linha 7.
	
		HBox hbox7E2 = new HBox(10);
		hbox7E2.getChildren().addAll(profissaoTexto,profissaoField);
		
		HBox hbox7 = new HBox(50);
		hbox7.getChildren().addAll(hbox7E2);
		
		//Conjunto linha 8.
		HBox hbox8 = new HBox(10);
		hbox8.getChildren().addAll(compleTexto,compleArea);
		
		//Conjunto linha 9.
		HBox hbox9 = new HBox(10);
		hbox9.getChildren().addAll(cadastrar,cancelar);
		
		
		VBox vboxTitulo = new VBox(10);
		vboxTitulo.getChildren().addAll(titulo);
		
		VBox vbox = new VBox(15);
		vbox.getChildren().addAll(vboxTitulo,hbox1,hbox2,hbox3,hbox4,hbox5,hbox7,hbox8,hbox9);
		
		//Sets Alig..
		vboxTitulo.setAlignment(Pos.CENTER);
		hbox9.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Distância da borda.
		vbox.setPadding(new Insets(10,100,10,100));
		
		
		setCenter(vbox);
		setTop(vboxtop);//Setando menuBar sempre no topo.
		
	}
}
