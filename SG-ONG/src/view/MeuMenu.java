package view;

import java.text.ParseException;

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
		Menu financas = new Menu("Finanças");
		Menu ajuda = new Menu("Ajuda");
		
		//Parte de Cadastro
		MenuItem paciente = new MenuItem("Paciente");
		MenuItem socio = new MenuItem("Sócio");
		MenuItem doacao = new MenuItem("Doação");
		MenuItem despesas = new MenuItem("Despesas");
		
		//Parte de Consulta.
		MenuItem cSocio = new MenuItem("Sócio");
		MenuItem cPaciente = new MenuItem("Paciente");
		
		//Parte de Finanças.
		MenuItem listarDoacoes = new MenuItem("Despesas");	
		MenuItem listarDespesas = new MenuItem("Despesas");	
		MenuItem geraGrafico = new MenuItem("Gráfico");	
		MenuItem geraInfo = new MenuItem("Informações gerais");	

		//Parte de Ajuda.
		MenuItem ajudaD = new MenuItem("Ajuda SG ONG");
		MenuItem sobre = new MenuItem("Sobre");		
		
		//Parte de Doações (dentro de cadastro)
		MenuItem valor = new MenuItem("Valor");
		MenuItem itens = new MenuItem("Itens");
		
		cadastrar.getItems().addAll(paciente,socio, doacao, despesas);
		consultar.getItems().addAll(cPaciente,cSocio);
		financas.getItems().addAll(listarDoacoes, listarDespesas, geraGrafico, geraInfo);
		ajuda.getItems().addAll(ajudaD,sobre);
		
		
		getMenus().addAll(cadastrar,consultar,financas,ajuda);
		
		
		//Funções de cada atalho no Menu
		
		doacao.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CaDoacaoGUI());
				
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
				try {
					Main.mudarTela(new CaPacienteGUI());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		despesas.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new CaDespesaGUI());
				
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
				Main.mudarTela(new TelaInfoGerais());
				
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
