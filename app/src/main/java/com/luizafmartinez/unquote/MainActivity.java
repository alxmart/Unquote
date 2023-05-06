package com.luizafmartinez.unquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add generateRandomNumber() here
    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    // Add getGameOverMessage() here
    String getGameOverMessage(
            int totalCorrect,
            int totalQuestions) {

        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions +
                    " right! You won!";
        } else {
            return "You got " + totalCorrect +
                    " right out of " + totalQuestions +
                    ". Better luck next time!";
        }
    }





}