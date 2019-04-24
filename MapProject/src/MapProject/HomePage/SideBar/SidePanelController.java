package MapProject.HomePage.SideBar;

import MapProject.HomePage.HomePageController;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class SidePanelController implements Initializable {

    @FXML
    private JFXButton b1;
    
    @FXML
    private JFXButton b2;
    
    @FXML
    private JFXButton b3;
    
    @FXML
    private JFXButton home;   
    
    private HomePageController callback;
    
    public void setCallback(HomePageController callback) {
        this.callback = callback;
    }

    @Override 
    public void initialize(URL url, ResourceBundle rb) {
    	home.setOnAction(e->{
    		callback.anchorPane.getChildren().clear();
    		callback.btnLogout.setVisible(true);
    	}
    	);
    }

    @FXML
    private void switchPage(ActionEvent event) {
        JFXButton btn = (JFXButton) event.getSource();
        System.out.println(btn.getText());
        switch (btn.getText()) {
            case "Map":
                callback.LoadUi("/MapProject/HomePage/Mappage/Map.fxml", callback.anchorPane);
                break;
            case "Dash board":
                callback.LoadUi("/MapProject/HomePage/DashBoardPage/DashBoard.fxml",callback.anchorPane);
                break;
            case "Edit":
                callback.LoadUi("/MapProject/HomePage/EditPage/Edit.fxml",callback.anchorPane);
                break;                   	
        }
    }
}
