package charts;

import javax.print.DocFlavor.STRING;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.scene.BoundsAccessor;

import banco.InfoBD;
import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.Effect;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import view.CaDoacaoGUI;
import view.MeuMenu;
import view.TelaInfoGerais;

public class GrafBar extends BorderPane {
	
	private InfoBD info;
	
	
	public GrafBar(){
		
		info = new InfoBD();
		info.compoeDoacoes();
		info.compoeDespesas();
		
		VBox vboxTop = new VBox();
		MeuMenu menu = new MeuMenu();
		
		vboxTop.getChildren().add(menu);
		setTop(vboxTop);
		
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> grafico = new BarChart<String,Number>(xAxis,yAxis);
        
        
        grafico.setTitle("Balanço Anual");
        xAxis.setLabel("Meses");        //Nome que fica na horizontal.
        yAxis.setLabel("Valores(R$) "); // Nome que fica na vertical.
 
        
        //Representa todas as barras de entrada (doação).
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Doações");
        
        series1.getData().add(new XYChart.Data("Janeiro", info.getDoacoesJan()));
        series1.getData().add(new XYChart.Data("Fevereiro", info.getDoacoesFev()));
        series1.getData().add(new XYChart.Data("Março", info.getDoacoesMar()));
        series1.getData().add(new XYChart.Data("Abril", info.getDoacoesAbr()));
        series1.getData().add(new XYChart.Data("Maio", info.getDoacoesMai()));  
        series1.getData().add(new XYChart.Data("Junho", info.getDoacoesJun()));
        series1.getData().add(new XYChart.Data("Julho", info.getDoacoesJul()));
        series1.getData().add(new XYChart.Data("Agosto", info.getDoacoesAgo()));
        series1.getData().add(new XYChart.Data("Setembro", info.getDoacoesSet()));
        series1.getData().add(new XYChart.Data("Outubro", info.getDoacoesOut()));
        series1.getData().add(new XYChart.Data("Novembro", info.getDoacoesNov()));
        series1.getData().add(new XYChart.Data("Dezembro", info.getDoacoesDez()));

   
        //Representa todas as barras de saida (despesa).
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Despesas");
        
        series2.getData().add(new XYChart.Data("Janeiro", info.getDespesasJan()));
        series2.getData().add(new XYChart.Data("Fevereiro", info.getDespesasFev()));
        series2.getData().add(new XYChart.Data("Março", info.getDespesasMar()));
        series2.getData().add(new XYChart.Data("Abril", info.getDespesasAbr()));
        series2.getData().add(new XYChart.Data("Maio", info.getDespesasMai())); 
        series2.getData().add(new XYChart.Data("Junho", info.getDespesasJun()));
        series2.getData().add(new XYChart.Data("Julho", info.getDespesasJul()));
        series2.getData().add(new XYChart.Data("Agosto", info.getDespesasAgo()));
        series2.getData().add(new XYChart.Data("Setembro", info.getDespesasSet()));
        series2.getData().add(new XYChart.Data("Outubro", info.getDespesasOut())); 
        series2.getData().add(new XYChart.Data("Novembro", info.getDespesasNov()));
        series2.getData().add(new XYChart.Data("Dezembro", info.getDespesasDez()));


        grafico.getData().addAll(series1, series2);
        grafico.setMaxSize(1200, 800);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(grafico);
        vbox.setAlignment(Pos.CENTER);
        setCenter(vbox);
	}
}
