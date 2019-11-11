package com.kauzganga.scoresheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int goalsTeamA = 0;

    // Tracks the score for Team B
    int goalsTeamB = 0;

    // Tracks the fouls for Team A
    int foulsTeamA = 0;

    // Tracks the fouls for Team B
    int foulsTeamB = 0;

    // Tracks the corner kicks for Team A
    int cornerKicksTeamA = 0;

    // Tracks the corner kicks for Team B
    int cornerKicksTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goals for TeamA by 1.
     */
    public void addGoalForTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    /**
     * Increase the fouls for TeamA by 1.
     */
    public void addFoulForTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the corner kicks for Team A by 1.
     */
    public void addCornerForTeamA(View v) {
        cornerKicksTeamA = cornerKicksTeamA + 1;
        displayCornerForTeamA(cornerKicksTeamA);
    }

    /**
     * Increase the goals for TeamB by 1.
     */
    public void addGoalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    /**
     * Increase the fouls for TeamB by 1.
     */
    public void addFoulForTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Increase the corner kicks for teamB by 1
     */
    public void addCornerForTeamB(View v) {
        cornerKicksTeamB = cornerKicksTeamB + 1;
        displayCornerForTeamB(cornerKicksTeamB);
    }

    /**
     * Resets the metrics for both teams back to 0.
     */
    public void resetScore(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;

        cornerKicksTeamB = 0;
        cornerKicksTeamA = 0;

        foulsTeamB = 0;
        foulsTeamA = 0;

        displayGoalsForTeamA(goalsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayCornerForTeamA(cornerKicksTeamA);

        displayGoalsForTeamB(goalsTeamB);
        displayFoulsForTeamB(foulsTeamB);
        displayCornerForTeamB(cornerKicksTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team A
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the corners for Team A
     */
    public void displayCornerForTeamA(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_a_corners);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Displays the goals for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team B
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the corners for Team B
     */
    public void displayCornerForTeamB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_b_corners);
        cornerView.setText(String.valueOf(corner));
    }


}
