/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame;

/**
 *
 * @author Laura
 */
import java.io.IOException;
import javafx.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TriviaGameController {

    @FXML
    private Button buttonStart;

    @FXML
    private Label questionLabel, name;

    @FXML
    private Label pointscore;

    @FXML
    private TextField answerChoice;

    @FXML
    private Button buttonAnswer, highscoreButton, nextButton;

    ArrayList<Questions> questions = new ArrayList<>();
    int questionId = 0;
    int playerPoints = 0;
    
    @FXML
    private void sendtoScene3Action(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Scene 3 Window");
        stage.show();

        Scene3Controller controller3 = loader.getController();
        controller3.nameLabels(name.getText());
        controller3.endLabel(pointscore.getText());

    }

    public void initialize() {
        // Perform any necessary initialization here.
        questionLabel.setText("Please answer the following questions. ");

    }

    //when you click the start button
    public void buttonStart() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("AnswerCheat.txt"));

        /**
         * Create object instances of each question and pass them into an
         * ArrayList
         */
        int numQuestions = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numQuestions; i++) {
            questions.add(new Questions(scan.nextLine(), scan.nextLine(),
                    scan.nextLine(), scan.nextLine(), scan.nextLine()));
        }
                    
                printQuestion(questions.get(questionId));
                   
            
        
    }

    public void nextButton() throws FileNotFoundException{
        
        questionId++;
       answerChoice.setText(null);
       printQuestion(questions.get(questionId));
       
    


    }

    public void buttonAnswer() throws FileNotFoundException {
        
        
        String answer = answerChoice.getText();
          
        
            if (answer.equalsIgnoreCase(questions.get(questionId).correctAnswer)) {
                playerPoints++;
                questionLabel.setText("You got it right! You have "
                        + playerPoints + " points.\n");
                pointscore.setText("Score: " + playerPoints);
            } else {
                questionLabel.setText("Sorry, that was incorrect! You have "
                        + playerPoints + " points.\n");
                pointscore.setText("Score: " + playerPoints);
}
        }
    
    
    //call the name from scene 1

    public void nameFields(String names) {
        name.setText(names);

    }
//calls the question.txt file

    public void printQuestion(Questions question) {
        questionLabel.setText(question.question + "\n" + question.answerOne + "\n" + question.answerTwo
                + "\n" + question.answerThree);
        
    }

   
}
