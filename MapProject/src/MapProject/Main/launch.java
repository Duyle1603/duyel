package MapProject.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class launch extends Application {
	
    public static Boolean isSplashLoaded = false;
    int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
    int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

    //Stage stage;
    Scene scene;

    int initialX;
    int initialY;

    @Override
    public void start(Stage stage) throws Exception {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/MapProject/Select/Select.fxml"));
    	Parent root = loader.load();
        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MapGenerator");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

