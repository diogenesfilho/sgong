package view;

import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Ajuda extends BorderPane {
	
	public Ajuda(){
		
		TitledPane t1 = new TitledPane("Cadastrar", new Text("Nesta aba você pode cadastrar um paciente, sócio, doação ou depesa referente a ONG."+"\n"+"\n"
				+ "Instruções: " + "\n" + "\n" + "- Clique na opção cadastrar "+"\n"+"- Escolha uma das possibilidades "+"\n"+"- Preencha os campos corretamente"+"\n"+"- Clique no botão cadastrar"));
      
		TitledPane t2 = new TitledPane("Consultar", new Text("Com esta função você consulta os pacientes ou sócios cadastrados e suas respectivas informações."+"\n"+"\n"
				+ "Instruções: " + "\n" + "\n" + "- Clique na opção consultar "+"\n"+"- Escolha entre Paciente ou Sócio "+"\n"+"- Busque o desejado"));
     
		TitledPane t3 = new TitledPane("Finanças", new Text("        Aqui você pode listar as doações e despesas com seus valores, descrições e meses, acessar um gráfico financeiro" + "\n" + " anual ou visualizar as informações gerais da ONG."+"\n"+"\n"
				+ "Instruções: " + "\n" + "\n" + "- Clique na opção cadastrar "+"\n"+"- Escolha uma das possibilidades "+"\n"+"- Veja o controle financeiro"));
     
		Accordion accordion = new Accordion();
        accordion.getPanes().add(t1);
        accordion.getPanes().add(t2);
        accordion.getPanes().add(t3);
        
        accordion.setMaxSize(500, 500);
		
		MeuMenu menu = new MeuMenu();
		ImageView verFundo = new ImageView("/image/telaprinc.png");
		StackPane stack = new StackPane();
		
		stack.getChildren().addAll(verFundo,accordion,menu );
		setCenter(stack);
		setTop(menu);

		
	}

}
