package app;



import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
		TelaLoguin root = new TelaLoguin(); //TelaPrincipal root = new TelaPrincipal(); //
		SCENE = new Scene(root,1240,600,Color.LIGHTGRAY);
		
		primaryStage.setTitle("SG ONG");
		primaryStage.setScene(SCENE);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}