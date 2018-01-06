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
    int gameRogerFederer = 0;
    int gameRafaelNadal = 0;



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
        } else if (counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        } else if (counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        } else if (counterRogerFederer == 3) {
            displayForRogerFedererAD("AD");
            return;
        } else if (counterRogerFederer == 4) {

            scoreRogerFederer = 0;
            scoreRafaelNadal = 0;
            clear();
            displayForRogerFedererWin(scoreRogerFederer = 0);
            return;
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
        } else if (counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        } else if (counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        } else if (counterRogerFederer == 3) {
            displayForRogerFedererAD("AD");
            return;
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
        } else if (counterRogerFederer == 1) {
            scoreRogerFederer = scoreRogerFederer + 15;
        } else if (counterRogerFederer == 2) {
            scoreRogerFederer = scoreRogerFederer + 10;
        } else if (counterRogerFederer == 3) {
        displayForRogerFedererAD("AD");
        return;
    }
        counterRogerFederer = counterRogerFederer + 1;
        displayForRogerFederer(scoreRogerFederer);

    }


    /**
     * This method is called when the "Ace" is clicked for Rafael Nadal
     */
    public void addAceForRafaelNadal(View v) {
        if (counterRafaelNadal == 0) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        } else if (counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        } else if (counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        } else if (counterRafaelNadal == 3) {
            displayForRafaelNadalAD("AD");
        return;

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
        } else if (counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        } else if (counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        }else if (counterRogerFederer == 3) {
            displayForRafaelNadalAD("AD");
            return;
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
        } else if (counterRafaelNadal == 1) {
            scoreRafaelNadal = scoreRafaelNadal + 15;
        } else if (counterRafaelNadal == 2) {
            scoreRafaelNadal = scoreRafaelNadal + 10;
        }else if (counterRogerFederer == 3) {
            displayForRafaelNadalAD("AD");
            return;
        }

        counterRafaelNadal = counterRafaelNadal + 1;
        displayForRafaelNadal(scoreRafaelNadal);

    }


    /**
     * This method is called when New Game button is pressed
     */

    public void resetScore(View v) {
        scoreRogerFederer = 0;
        scoreRafaelNadal = 0;
        counterRogerFederer = 0;
        counterRafaelNadal = 0;
        gameRogerFederer = 0;
        gameRafaelNadal = 0;
        displayForRogerFederer(scoreRogerFederer);
        displayForRafaelNadal(scoreRafaelNadal);

    }

    /**
     * This method is called when one of the players win and the scores are cleaned
     */

    public void clear(){
        scoreRogerFederer = 0;
        scoreRafaelNadal = 0;
        counterRogerFederer = 0;
        counterRafaelNadal = 0;
        gameRogerFederer = 0;
        gameRafaelNadal = 0;
        displayForRogerFederer(scoreRogerFederer = 0);
        displayForRafaelNadal(scoreRafaelNadal = 0);
    }



    /**
     * Displays the given score for Roger Federer.
     */
    public void displayForRogerFederer(int score) {
        TextView scoreView = findViewById(R.id.roger_federer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the ADVANTAGE score for Roger Federer.
     */

    public void displayForRogerFedererAD(String advantageRogerFederer) {
        TextView advantageView = findViewById(R.id.roger_federer_score);
        advantageView.setText(String.valueOf(advantageRogerFederer));
    }

    /**
     * Displays the game win score for Roger Federer.
     */
    public void displayForRogerFedererWin(int winRogerFederer) {
        TextView winView = findViewById(R.id.roger_federer_score);
        winView.setText(String.valueOf(winRogerFederer));
    }


    /**
     * Displays the given score for Rafael Nadal.
     */
    public void displayForRafaelNadal(int score) {
        TextView scoreView = findViewById(R.id.rafael_nadal_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the ADVANTAGE score for Rafael Nadal.
     */

    public void displayForRafaelNadalAD(String advantageRafaelNadal) {
        TextView advantageView = findViewById(R.id.rafael_nadal_score);
        advantageView.setText(String.valueOf(advantageRafaelNadal));
    }
}