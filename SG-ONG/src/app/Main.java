package app;



/**
 * Aqui serao organizados os elementos que serao executados com inicio do programa bem como suas definicoes.
 * 
 * @author Diogenes Laertius Silva de Oliveira Filho
 * @author José Arnóbio de Oliveira Júnior
 * @author João Vitor Silva Oliveira
 * 
 * @version 1.5
 * 
 */
import banco.Banco;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import view.LoginGUI;


public class Main extends Application {
	
	private static Banco bd;
	private static Scene SCENE;
	
	public static Banco getBanco(){
		return bd;
	}
	
	public static void mudarTela(Parent root){
		Main.SCENE.setRoot(root);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		if(bd == null){
			bd = new Banco();	
		}
		
		LoginGUI root = new LoginGUI();
		SCENE = new Scene(root,1240,600, Color.LIGHTGRAY);
	
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			
			@Override
			public void handle(WindowEvent arg0) {
				bd.close();
			}
		});
		primaryStage.setTitle("SG ONG - Sistema Gerenciador de ONG");
		primaryStage.setScene(SCENE);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);

	}

}