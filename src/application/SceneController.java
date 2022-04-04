package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController {
		
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@FXML
	private AnchorPane scenePane;
	
	@FXML
	private Button LogoutButton;
	
	
	public void switchToMainMenu(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
    public void switchToMainGame(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("MainGame.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    public void switchToMainEnd(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("MainEnd.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    public void logout(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit");
    	alert.setHeaderText("You are about to exit!");
    	alert.setContentText("Are you sure you want to exit?");
    	
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		System.out.println("You have exited the application.");
    		stage.close();
    	}
    }
}
