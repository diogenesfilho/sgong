package app;



/**
 * Aqui serao organizados os elementos que serao executados com inicio do programa bem como suas definicoes.
 * 
 * @author Diogenes Laertius Silva de Oliveira Filho
 * @author José Arnóbio de Oliveira Júnior
 * @author João Vitor Silva Oliveira
 * 
 * @version 1.0
 * 
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import view.TelaLoguin;


public class Main extends Application {
	
	
	private static Scene SCENE;
	
	public static void mudarTela(Parent root){
		Main.SCENE.setRoot(root);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TelaLoguin root = new TelaLoguin();
		SCENE = new Scene(root,1240,600, Color.LIGHTGRAY);
	
		primaryStage.setTitle("SG ONG");
		primaryStage.setScene(SCENE);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}