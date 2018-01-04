package com.example.android.rolandgarrosmensfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRogerFederer = 0;
    int scoreRafaelNadal = 0;
    int counterRogerFederer = 0;
    int counterRafaelNadal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the "Ace" is clicked for Roger Federer
     */
    public void addAceForRogerFederer(View v) {

        if (counterRogerFederer == 0) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        }
            counterRogerFederer = counterRogerFederer + 1;
            displayForRogerFederer(scoreRogerFederer);

    }


    /**
     * This method is called when the "First Serve" is clicked for Roger Federer
     */

    public void addFirstServeForRogerFederer(View v) {

        if (counterRogerFederer == 0) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        }
            counterRogerFederer = counterRogerFederer + 1;
            displayForRogerFederer(scoreRogerFederer);

    }


    /**
     * This method is called when the "Second Serve" points is clicked for Roger Federer
     */
    public void addSecondServeForRogerFederer(View v) {
        if (counterRogerFederer == 0) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        }
        else if(counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        }
            counterRogerFederer = counterRogerFederer + 1;
            displayForRogerFederer(scoreRogerFederer);

    }



    /**
     * This method is called when the "Ace" is clicked for Rafael Nadal
     */
    public void addAceForRafaelNadal(View v) {
        if (counterRafaelNadal == 0) {
            scoreRafaelNadal = scoreRafaelNadal+ 15;
        }
        else if(counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        }
       else if(counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        }
            counterRafaelNadal = counterRafaelNadal + 1;
            displayForRafaelNadal(scoreRafaelNadal);

    }


    /**
     * This method is called when the "Fist serve" is clicked Rafael Nadal
     */
    public void addFirstServeForRafaelNadal(View v) {
        if (counterRafaelNadal == 0) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        }
        else if(counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        }
        else if(counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        }
            counterRafaelNadal = counterRafaelNadal + 1;
            displayForRafaelNadal(scoreRafaelNadal);

    }



    /**
     * This method is called when the "Second serve" points is clicked for Rafael Nadal
     */
    public void addSecondServeForRafaelNadal(View v) {
        if (counterRafaelNadal == 0) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        }
        else if(counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        }
        else if (counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        }

            counterRafaelNadal = counterRafaelNadal + 1;
            displayForRafaelNadal(scoreRafaelNadal);

    }


    /**
     * This method is called when New Game button is pressed
     */

    public void resetScore (View v) {
        scoreRogerFederer = 0;
        scoreRafaelNadal = 0;
        counterRogerFederer = 0;
        counterRafaelNadal = 0;
        displayForRogerFederer(scoreRogerFederer);
        displayForRafaelNadal(scoreRafaelNadal);

    }

    /**
     * Displays the given score for Roger Federer.
     */
    public void displayForRogerFederer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.roger_federer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Rafael Nadal.
     */
    public void displayForRafaelNadal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rafael_nadal_score);
        scoreView.setText(String.valueOf(score));
    }


}