package JavaExercises.Lab14.P1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Window extends JFrame {
    static List<Question> questionsArray;
    static int correctAnswersCounter;
    static int questionsCounter;
    static Iterator questionsIterator; // set as static to maintain the current position in the iteration
    Question currentQuestion;
    FileReader fr = null;
    BufferedReader bfr = null;
    ButtonGroup radioGroupAnswers;
    JFrame _thisFrame; // used to hide the current window after clicking Next button

    public void getQuestionsFromFile(){
        questionsArray = new ArrayList<Question>();
        try {
            fr = new FileReader("C:\\Users\\Otii\\Documents\\GitHub\\" +
            "java-exercises\\JavaExercises\\Lab14\\P1\\questions.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String currentLine = bfr.readLine();
                if(currentLine == null) {
                    break;
                }
                else { // split every line to get the question and answers
                    String[] stringSplit = currentLine.split("#");
                    String questionString = stringSplit[0]; // question at index 0
                    String answerA = stringSplit[1]; // a answer at index 1
                    String answerB = stringSplit[2]; // b answer at index 2
                    String answerC = stringSplit[3]; // c answer at index 3
                    String correctAnswer = stringSplit[4]; // correct answer at index 4
                    Question currentQuestion = new Question(questionString,answerA, answerB, answerC, correctAnswer);
                    questionsArray.add(currentQuestion); 
                } 
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.exit(0);
        }
    }

    public Window(boolean initialWindow){
        _thisFrame = this;
        // check if it is the first window and initialize the static variables
        if(initialWindow){
            // get the questions from the file and hold them for every new window
            this.getQuestionsFromFile();
            // the number of questions will be available for every window for the message dialog
            this.questionsCounter = questionsArray.size();
            // the counter will maintain the number of correct answers for every new window
            this.correctAnswersCounter = 0;
            // the iterator will maintain the cursor for every new window
            this.questionsIterator = questionsArray.iterator();
        }
        this.createPanel();
    }

    public void createPanel(){
        // if there are more questions in the collection, there can be more windows to be shown
        if(questionsIterator.hasNext()){
            // create panel for the window
            JPanel panel = new JPanel();
            // create panel for Next and Exit buttons
            JPanel buttonsPanel = new JPanel();
            // get the current question from the iterator
            currentQuestion = (Question)questionsIterator.next();
            // create a label for the question
            JLabel jlbQuestion = new JLabel(currentQuestion.question);
            // create labels for answers A, B, C
            JLabel jlbAnswerA = new JLabel("a." + currentQuestion.answerA);
            JLabel jlbBAnswerB = new JLabel("b." + currentQuestion.answerB);
            JLabel jlbAnswerC = new JLabel("c." + currentQuestion.answerC);
            // create a radio group for radio buttons a, b, c 
            radioGroupAnswers = new ButtonGroup();
            // create the radio buttons for the group and set names
            JRadioButton radioBtnA = new JRadioButton("a");
            // set value meaning
            radioBtnA.setActionCommand(currentQuestion.answerA);
            JRadioButton radioBtnB = new JRadioButton("b");
            radioBtnB.setActionCommand(currentQuestion.answerB);
            JRadioButton radioBtnC = new JRadioButton("c");
            radioBtnC.setActionCommand(currentQuestion.answerC);
            // add the radio buttons to the group
            radioGroupAnswers.add(radioBtnA);
            radioGroupAnswers.add(radioBtnB);
            radioGroupAnswers.add(radioBtnC);
            // create the Next button and add action listener
            JButton btnNext = new JButton("Next");
            btnNext.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent e) { 
                _thisFrame.setVisible(false);
                // get selected option from the radio button group
                String selectedAnswer = radioGroupAnswers.getSelection().getActionCommand();
                // check if the selected radio button value is the same as the correct answer
                // for the current question
                if(selectedAnswer.equals(currentQuestion.correctAnswer)){
                    correctAnswersCounter++;
                }
                // check if there is another question after this one to display a new window for it
                 if(questionsIterator.hasNext()){
                    Window f = new Window(false);
                    f.pack();
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                 } else{
                     // show the correct answers count if there are no more new questions to be shown
                    JOptionPane.showMessageDialog(null,"Raspunsuri corecte: " 
                    + correctAnswersCounter + "/" + questionsCounter);
                 }
                }});
            JButton btnExit = new JButton("Exit");
            // create the Exit button and add action listener
            btnExit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"Raspunsuri corecte: "
                     + correctAnswersCounter + "/" + questionsCounter);
                     System.exit(1);
                }
            });
            // add the buttons to the panel 
            buttonsPanel.add(btnNext);
            buttonsPanel.add(btnExit);
            // add the graphical elements in the order we want to display them in
            panel.add(jlbQuestion);
            panel.add(jlbAnswerA);
            panel.add(jlbBAnswerB);
            panel.add(jlbAnswerC);
            panel.add(radioBtnA);
            panel.add(radioBtnB);
            panel.add(radioBtnC);
            panel.add(buttonsPanel);
            // set the layout to display on 8 lines and 1 column
            panel.setLayout(new GridLayout(8,1));
            // get the window's / frame content area
            Container c = getContentPane();
            // add the panel to the frame content area
            c.add(panel);
        } 
    }
 
}
