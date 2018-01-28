package com.example.android.footballscorecounter;

import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsForA = 0;
    int pointsForB = 0;
    int foulsForA = 0;
    int foulsForB = 0;


    ///////////////// -- Buttons -- ///////////////////

    //... 1 Point for A

    public void onePointA(View view) {
        pointsForA = pointsForA + 1;
        displayScoreTeamA(pointsForA);
    }

    //... 1 Faul for A

    public void oneFoulA(View view) {
        foulsForA = foulsForA + 1;
        displayFoulsTeamA(foulsForA);
    }

    //... 1 Point For B

    public void onePointB(View view) {
        pointsForB = pointsForB + 1;
        displayScoreTeamB(pointsForB);
    }

    //... 1 Fault For B

    public void oneFoulB(View view) {
        foulsForB = foulsForB + 1;
        displayFoulsTeamB(foulsForB);
    }

    //... RESET

    public void resetButton(View view) {
        pointsForA = 0;
        pointsForB = 0;
        foulsForA = 0;
        foulsForB = 0;

        displayScoreTeamA(pointsForA);
        displayScoreTeamB(pointsForB);
        displayFoulsTeamA(foulsForA);
        displayFoulsTeamB(foulsForB);
    }


    /////////// -- DISPLAY -- /////////////


    /**
     * Displays the given score for Team A.
     */

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fauls for Team B.
     */

    public void displayFoulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fauls for Team B.
     */

    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }
}
