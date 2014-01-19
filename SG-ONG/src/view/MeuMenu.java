package view;

import charts.GrafBar;
import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MeuMenu extends MenuBar {
	public MeuMenu(){
		
		Menu cadastrar = new Menu("Cadastrar");
		Menu consultar = new Menu("Consultar");
		Menu financas = new Menu("Balanço");
		Menu ajuda = new Menu("Ajuda");

		
		//Parte de Cadastro
		MenuItem paciente = new MenuItem("Paciente");
		MenuItem socio = new MenuItem("Sócio");
		MenuItem doacao = new MenuItem("Doação"); //Entra como Menu pois tem duas opções dentro dele.
		MenuItem despesas = new MenuItem("Despesas");
		
		
		//Parte de Consulta.
		MenuItem cSocio = new MenuItem("Sócio");
		MenuItem cPaciente = new MenuItem("Paciente");
		MenuItem cDoacao = new MenuItem("Itens doados");//OBS. Coloquei isso pois seria bom ter uma ideia dos itens que foram doados. Pode ser implementado futuramente.
		
		//Parte de Balanço.
		MenuItem gerarBalanco = new MenuItem("Gerar Balanço");	
		MenuItem gerarTotalSocio = new MenuItem("População Ativa");//OBS
		
		//Parte de Ajuda.
		MenuItem ajudaD = new MenuItem("Ajuda Dinâmica");
		MenuItem sobre = new MenuItem("Sobre");		
		
		cadastrar.getItems().addAll(paciente,socio, doacao, despesas);
		consultar.getItems().addAll(cPaciente,cSocio,cDoacao);
		financas.getItems().addAll(gerarBalanco,gerarTotalSocio);
		ajuda.getItems().addAll(ajudaD,sobre);
		
		getMenus().addAll(cadastrar,consultar,financas,ajuda);
		
		//Funções de cada atalho no Menu -> Definição: NOMEDOBOTÃO.setOnAction(new EventHandler<ActionEvent>() {.
		
		
		doacao.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new Doacao());
				
			}
		}); 
		
	
		socio.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CadastroSocio());
				
			}
		});
		
		paciente.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CadastroPaciente());
			}
		});
		
		despesas.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new Despesa());
				
			}
		});
		
		gerarBalanco.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new GrafBar());
				
			}
		});
		
	}
}
