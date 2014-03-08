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
		
		//Parte de Balanço.
		MenuItem gerarBalanco = new MenuItem("Gerar Balanço");	
		
		//Parte de Ajuda.
		MenuItem ajudaD = new MenuItem("Ajuda Dinâmica");
		MenuItem sobre = new MenuItem("Sobre");		
		
		cadastrar.getItems().addAll(paciente,socio, doacao, despesas);
		consultar.getItems().addAll(cPaciente,cSocio);
		financas.getItems().addAll(gerarBalanco);
		ajuda.getItems().addAll(ajudaD,sobre);
		
		getMenus().addAll(cadastrar,consultar,financas,ajuda);
		
		//Funções de cada atalho no Menu -> Definição: NOMEDOBOTÃO.setOnAction(new EventHandler<ActionEvent>() {.
		
		
		doacao.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new DoacaoGUI());
				
			}
		}); 
		
	
		socio.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CaSocioGUI());
				
			}
		});
		
		paciente.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CaPacienteGUI());
			}
		});
		
		despesas.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new DespesaGUI());
				
			}
		});
		
		gerarBalanco.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new GrafBar());
				
			}
		});
		
		cSocio.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new ConSocioGUI());
				
			}
		}); 
		
		cPaciente.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new ConPacienteGUI());
				
			}
		}); 
		
		sobre.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new Sobre());
				
			}
		}); 
		
		ajudaD.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new Ajuda());
				
			}
		}); 
		
	}
}