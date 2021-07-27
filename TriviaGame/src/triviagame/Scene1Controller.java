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
import javafx.scene.control.TextField;

/**
 *
 * @author Laura
 */

public class Scene1Controller {

    @FXML
    private Button nameButton;

    @FXML
    private Label titleLabel, nameLabel;

    @FXML
    private TextField nameField;

    @FXML
    private void sendtoScene2Action(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("TriviaScene.fxml"));
        Parent root = loader.load();

        TriviaGameController controller2 = loader.getController();
        controller2.nameFields(nameField.getText());
        
        
        
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Scene 2 Window");
        stage.show();

    }

}
