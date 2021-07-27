/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Laura
 */
public class Scene3Controller {

    @FXML
    public Button againButton, exitButton;

    @FXML
    private Label theendTitle, endLabel, nameLabel;

    @FXML
    private void sendtoScene1Action(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Parent root = loader.load();    

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Scene 1 Window");
        stage.show();   
        
    }

    @FXML
    public void exitButton(ActionEvent event) {
        
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();

    }

    public void nameLabels(String names) {
        nameLabel.setText(names);

    }

    public void endLabel(String score) {
        endLabel.setText("You ended with " + score);
    }
}
