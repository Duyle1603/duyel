package MapProject.LoginPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.jfoenix.controls.JFXButton;
import MapProject.HomePage.HomePageController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PageController implements Initializable{

    @FXML
    private JFXButton SignInbtn;
    

    @FXML
    private AnchorPane root;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
    	SignInbtn.setOnAction(e->{
    		Parent root1= null;
        	try {
        	root1= FXMLLoader.load(getClass().getResource("/MapProject/HomePage/MapHomePage.fxml"));
        	}catch(IOException ex) {
        		Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null,ex);
        	}
        	root.getChildren().setAll(root1);
        	root.setTopAnchor(root1, 0.0);
        	root.setBottomAnchor(root1, 0.0);
        	root.setLeftAnchor(root1, 0.0);
        	root.setRightAnchor(root1, 0.0);
    	});
    }
}
