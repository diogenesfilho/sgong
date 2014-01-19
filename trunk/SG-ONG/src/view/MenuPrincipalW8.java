package view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MenuPrincipalW8 extends BorderPane {
	public MenuPrincipalW8(){
		
		//6 atalhos básicos.
		final ImageView imagem = new ImageView("/image/AAPC");
		final ImageView imagem2 = new ImageView("/image/AAPC");
		final ImageView imagem3 = new ImageView("/image/AAPC");
		final ImageView imagem4 = new ImageView("/image/AAPC");
		final ImageView imagem5 = new ImageView("/image/AAPC");
		final ImageView imagem6 = new ImageView("/image/AAPC");
		
		HBox hbox1 = new HBox(20);
		hbox1.getChildren().addAll(imagem,imagem2,imagem3);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox(20);
		hbox2.getChildren().addAll(imagem4,imagem5,imagem6);
		hbox2.setAlignment(Pos.CENTER);
		
		
		
		VBox vboxImagens = new VBox(20);
		
		vboxImagens.getChildren().addAll(hbox1,hbox2);//Adicionar outras imagens aqui.
		vboxImagens.setAlignment(Pos.CENTER);
		setCenter(vboxImagens);//Pq?
		
		//Partes responsávei por cada efeito vísivel dos botões.
		//Imagem..
		imagem.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});
					
		//Quando mover o mouse opacidade diminui.
		imagem.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem.setOpacity(0.5);
						
			}
		});
		
		//Botão voltar ao normal.		
		imagem.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imagem.setOpacity(1);
						
			}
		});
		
		//Imagem2.
		imagem2.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
								
			}
		});
						
		imagem2.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem2.setOpacity(0.5);
								
			}
		});
						
		imagem2.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imagem2.setOpacity(1);
								
			}
		});
				
		//Imagem3.
		imagem3.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
								
			}
		});
						
		imagem3.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem3.setOpacity(0.5);
								
			}
		});
						
		imagem3.setOnMouseExited(new EventHandler<Event>() {
			
			@Override
			public void handle(Event event) {
				imagem3.setOpacity(1);
								
			}
		});
				
				
		//Imagem4.
		imagem4.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});
						
		imagem4.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem4.setOpacity(0.5);
								
			}
		});
						
		imagem4.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imagem4.setOpacity(1);
								
			}
		});
				
		//Imagem5.
		imagem5.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
								
			}
		});
						
		imagem5.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem5.setOpacity(0.5);
								
			}
		});
						
		imagem5.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imagem5.setOpacity(1);
							
				}
			});
				
		//Imagem6.
		imagem6.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
								
			}
		});
						
		imagem6.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				imagem6.setOpacity(0.5);
						
			}
		});
						
		imagem6.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imagem6.setOpacity(1);
								
			}
		});
	}

}
