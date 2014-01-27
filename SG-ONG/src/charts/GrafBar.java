package charts;


import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import view.MeuMenu;

public class GrafBar extends BorderPane {
	public GrafBar(){
		
		VBox vboxTop = new VBox();
		MeuMenu menu = new MeuMenu();
		
		vboxTop.getChildren().add(menu);
		setTop(vboxTop);
		
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> balanco = new BarChart<String,Number>(xAxis,yAxis);
        
        balanco.setTitle("Balanço Anual");
        xAxis.setLabel("Meses");        //Nome que fica na horizontal.
        yAxis.setLabel("Valores(R$) "); // Nome que fica na vertical.
 
        
        //Representa todas as barras De entrada ou seja doação.
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Entrada");
        
        series1.getData().add(new XYChart.Data("Janeiro", 4500));
        series1.getData().add(new XYChart.Data("Fevereiro", 4600));
        series1.getData().add(new XYChart.Data("Março", 4300));
        series1.getData().add(new XYChart.Data("Abril", 4150));
        series1.getData().add(new XYChart.Data("Maio", 3800));  
        series1.getData().add(new XYChart.Data("Junho", 4500));
        series1.getData().add(new XYChart.Data("Julho", 4600));
        series1.getData().add(new XYChart.Data("Agosto", 4300));
        series1.getData().add(new XYChart.Data("Setembro", 4150));
        series1.getData().add(new XYChart.Data("Outubro", 3800));
        series1.getData().add(new XYChart.Data("Novembro", 4500));
        series1.getData().add(new XYChart.Data("Dezembro", 4600));

        
        
        //Representa todas as barras De saída ou seja despesa.
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Saida");
        
        series2.getData().add(new XYChart.Data("Janeiro", 5200));
        series2.getData().add(new XYChart.Data("Fevereiro", 5500));
        series2.getData().add(new XYChart.Data("Março", 4800));
        series2.getData().add(new XYChart.Data("Abril", 4500));
        series2.getData().add(new XYChart.Data("Maio", 4802)); 
        series2.getData().add(new XYChart.Data("Junho", 5200));
        series2.getData().add(new XYChart.Data("Julho", 5500));
        series2.getData().add(new XYChart.Data("Agosto", 4800));
        series2.getData().add(new XYChart.Data("Setembro", 4500));
        series2.getData().add(new XYChart.Data("Outubro", 4802)); 
        series2.getData().add(new XYChart.Data("Novembro", 5300));
        series2.getData().add(new XYChart.Data("Dezembro", 5100));

        
        Button valores = new Button("Valores Exatos");

        balanco.getData().addAll(series1, series2);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(balanco,valores);
        vbox.setAlignment(Pos.CENTER);
        setCenter(vbox);
	}
}
