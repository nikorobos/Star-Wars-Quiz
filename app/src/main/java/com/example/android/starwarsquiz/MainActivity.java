package com.example.android.starwarsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //declaring radio groups and edit text as private and initializing score to 0
    private RadioGroup firstRadioGroup, secondRadioGroup, thirdRadioGroup, fourthRadioGroup,
            seventhRadioGroup, eighthRadioGroup;


    private EditText firstEditText;
    CheckBox firstCheckBox, secondCheckBox, thirdCheckBox, fourthCheckBox, fifthCheckBox, sixthCheckBox;

    int score = 0;

    //adding the radiogroups and the checkboxes in onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstRadioGroup = (RadioGroup) findViewById(R.id.question1);
        secondRadioGroup = (RadioGroup) findViewById(R.id.question2);
        thirdRadioGroup = (RadioGroup) findViewById(R.id.question3);
        fourthRadioGroup = (RadioGroup) findViewById(R.id.question4);
        firstEditText = (EditText) findViewById(R.id.question5);
        seventhRadioGroup = (RadioGroup) findViewById(R.id.question7);
        eighthRadioGroup = (RadioGroup) findViewById(R.id.question8);
        firstCheckBox = (CheckBox) findViewById(R.id.checkboxNum1);
        secondCheckBox = (CheckBox) findViewById(R.id.checkboxNum2);
        thirdCheckBox = (CheckBox) findViewById(R.id.checkboxNum3);
        fourthCheckBox = (CheckBox) findViewById(R.id.checkboxNum4);
        fifthCheckBox = (CheckBox) findViewById(R.id.checkboxNum5);
        sixthCheckBox = (CheckBox) findViewById(R.id.checkboxNum6);


    }

    //score method finding the ids and declaring the names of radiobuttons,checkboxes,editext also booleans and string
    public void score(View view) {


        RadioButton questionOneA = (RadioButton) findViewById(R.id.radio1A);
        boolean radio1A = questionOneA.isChecked();
        RadioButton questionOneB = (RadioButton) findViewById(R.id.radio1B);
        boolean radio1B = questionOneB.isChecked();
        RadioButton questionOneC = (RadioButton) findViewById(R.id.radio1C);
        boolean radio1C = questionOneC.isChecked();


        RadioButton questionTwoA = (RadioButton) findViewById(R.id.radio2A);
        boolean radio2A = questionTwoA.isChecked();
        RadioButton questionTwoB = (RadioButton) findViewById(R.id.radio2B);
        boolean radio2B = questionTwoB.isChecked();
        RadioButton questionTwoC = (RadioButton) findViewById(R.id.radio2C);
        boolean radio2C = questionTwoC.isChecked();


        RadioButton questionThreeA = (RadioButton) findViewById(R.id.radio3A);
        boolean radio3A = questionThreeA.isChecked();
        RadioButton questionThreeB = (RadioButton) findViewById(R.id.radio3B);
        boolean radio3B = questionThreeB.isChecked();
        RadioButton questionThreeC = (RadioButton) findViewById(R.id.radio3C);
        boolean radio3C = questionThreeC.isChecked();


        RadioButton questionFourA = (RadioButton) findViewById(R.id.radio4A);
        boolean radio4A = questionFourA.isChecked();
        RadioButton questionFourB = (RadioButton) findViewById(R.id.radio4B);
        boolean radio4B = questionFourB.isChecked();
        RadioButton questionFourC = (RadioButton) findViewById(R.id.radio4C);
        boolean radio4C = questionFourC.isChecked();


        EditText editTextFive = (EditText) findViewById(R.id.question5);
        String question5 = editTextFive.getText().toString();


        CheckBox questionSixA = (CheckBox) findViewById(R.id.checkboxNum1);
        boolean checkboxNum1 = questionSixA.isChecked();
        CheckBox questionSixB = (CheckBox) findViewById(R.id.checkboxNum2);
        boolean checkboxNum2 = questionSixB.isChecked();
        CheckBox questionSixC = (CheckBox) findViewById(R.id.checkboxNum3);
        boolean checkboxNum3 = questionSixC.isChecked();
        CheckBox questionSixD = (CheckBox) findViewById(R.id.checkboxNum4);
        boolean checkboxNum4 = questionSixD.isChecked();
        CheckBox questionSixE = (CheckBox) findViewById(R.id.checkboxNum5);
        boolean checkboxNum5 = questionSixE.isChecked();
        CheckBox questionSixF = (CheckBox) findViewById(R.id.checkboxNum6);
        boolean checkboxNum6 = questionSixF.isChecked();


        RadioButton questionSevenA = (RadioButton) findViewById(R.id.radio7A);
        boolean radio7A = questionSevenA.isChecked();
        RadioButton questionSevenB = (RadioButton) findViewById(R.id.radio7B);
        boolean radio7B = questionSevenB.isChecked();
        RadioButton questionSevenC = (RadioButton) findViewById(R.id.radio7C);
        boolean radio7C = questionSevenC.isChecked();


        RadioButton questionEightA = (RadioButton) findViewById(R.id.radio8A);
        boolean radio8A = questionEightA.isChecked();
        RadioButton questionEightB = (RadioButton) findViewById(R.id.radio8B);
        boolean radio8B = questionEightB.isChecked();
        RadioButton questionEightC = (RadioButton) findViewById(R.id.radio8C);
        boolean radio8C = questionEightC.isChecked();

        //giving the method an int declaration and passing the params in the method
        int scoreFinal = calculateScore(radio1A, radio1B, radio1C, radio2A, radio2B, radio2C,
                radio3A, radio3B, radio3C, radio4A, radio4B, radio4C, checkboxNum1, checkboxNum2, checkboxNum3, checkboxNum4, checkboxNum5, checkboxNum6,
                radio7A, radio7B, radio7C, radio8A, radio8B, radio8C, question5);


        //Printing the score
        String theMessage = "Your score is " + scoreFinal + " out of 8!" + "\nMay the force be with you!";
        displayScoreMessage(theMessage);


        //Toast messages if answers are not selected
        if (firstRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 1 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (secondRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 2 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (thirdRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 3 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (fourthRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 4 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (question5 == "") {
            Toast.makeText(this, "Question 5 is not answered", Toast.LENGTH_LONG).show();
        }


        if (!(checkboxNum1 || checkboxNum2 || checkboxNum3 || checkboxNum4 || checkboxNum5 || checkboxNum6)) {
            Toast.makeText(this, "Question 6 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (seventhRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 7 is not answered", Toast.LENGTH_SHORT).show();
        }


        if (eighthRadioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 8 is not answered", Toast.LENGTH_SHORT).show();
        }

    }


    public int calculateScore(boolean answer1A, boolean answer1B, boolean answer1C, boolean answer2A, boolean answer2B,
                              boolean answer2C, boolean answer3A, boolean answer3B, boolean answer3C, boolean answer4A,
                              boolean answer4B, boolean answer4C, boolean answer6A, boolean answer6B, boolean answer6C, boolean answer6D, boolean answer6E,
                              boolean answer6F, boolean answer7A, boolean answer7B, boolean answer7C, boolean answer8A,
                              boolean answer8B, boolean answer8C, String answer5)

    {


        //The right answer is A
        if (answer1A) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is C
        if (answer2C) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is C
        if (answer3C) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is B
        if (answer4B) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is millenium falcon
        switch (answer5) {
            case "millennium falcon":
                score++;
                break;
            case "Millennium Falcon":
                score++;
                break;
            case "MILLENNIUM FALCON":
                score++;
                break;
        }


        //The right answers are A, C, D, F

        if (answer6A && answer6C && answer6D && answer6F) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is C
        if (answer7C) {
            score++;
        } else {
            score = score + 0;
        }


        //The right answer is A
        if (answer8A) {
            score++;
        } else {
            score = score + 0;
        }
        //Return the final score


        return score;

    }

    //Resets the score to 0
    public void resetButton(View v) {


        score = 0;
        String resetScoreMessage = "  ";
        displayScoreMessage(resetScoreMessage);


        firstRadioGroup.clearCheck();
        secondRadioGroup.clearCheck();
        thirdRadioGroup.clearCheck();
        fourthRadioGroup.clearCheck();
        seventhRadioGroup.clearCheck();
        eighthRadioGroup.clearCheck();


        firstCheckBox.setChecked(false);
        secondCheckBox.setChecked(false);
        thirdCheckBox.setChecked(false);
        fourthCheckBox.setChecked(false);
        fifthCheckBox.setChecked(false);
        sixthCheckBox.setChecked(false);

        EditText firstEditText = (EditText) findViewById(R.id.question5);
        firstEditText.setText(null);
    }


    //displaying the score below the score button
    private void displayScoreMessage(String message) {
        TextView messageOfTheScore = (TextView) findViewById(R.id.score_answer);
        messageOfTheScore.setText(message);
        if (score >= 1) {
            Button scoreBtn = (Button) findViewById(R.id.score);
            scoreBtn.setEnabled(false);
        } else {
            Button scoreBtn = (Button) findViewById(R.id.score);
            scoreBtn.setEnabled(true);
        }
    }


}



