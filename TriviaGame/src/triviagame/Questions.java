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
public class Questions {

    String question = null;
    //Answer choices
    String answerOne = null;
    String answerTwo = null;
    String answerThree = null;
    //Correct answer
    String correctAnswer = null;

    public Questions(String question, String answerOne, String answerTwo,
            String answerThree, String correctAnswer) {

        this.question = question;
        //Answer choices
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        //Correct answer
        this.correctAnswer = correctAnswer;
    }

}


