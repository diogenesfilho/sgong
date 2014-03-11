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
		Menu balanco = new Menu("Balanço");
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
		MenuItem listarDoacoes = new MenuItem("Doações");
		MenuItem listarDespesas = new MenuItem("Despesas");	
		MenuItem geraGrafico = new MenuItem("Gráfico");	
		MenuItem geraInfo = new MenuItem("Informações gerais");	

		//Parte de Ajuda.
		MenuItem ajudaD = new MenuItem("Ajuda Dinâmica");
		MenuItem sobre = new MenuItem("Sobre");		
		
		cadastrar.getItems().addAll(paciente,socio, doacao, despesas);
		consultar.getItems().addAll(cPaciente,cSocio);
		balanco.getItems().addAll(listarDoacoes, listarDespesas, geraGrafico, geraInfo);
		ajuda.getItems().addAll(ajudaD,sobre);
		
		getMenus().addAll(cadastrar,consultar,balanco,ajuda);
		
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
		
		listarDespesas.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new ConDespesaGUI());
				
			}
		});
		
		
		listarDoacoes.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new ConDoacaoGUI());
				
			}
		});
		
		
		geraInfo.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new TelaValoresExatos());
				
			}
		});
		
		
		geraGrafico.setOnAction(new EventHandler<ActionEvent>() {
			
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
