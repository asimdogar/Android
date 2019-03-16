package com.dogar.asim.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO_POINTS = 2;
    final int POINTS_FOR_THREE_POINTS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScore(View view) {
        switch (view.getId()) {
            case R.id.team_a_three_points:
                scoreTeamA = scoreTeamA + POINTS_FOR_THREE_POINTS;
                break;
            case R.id.team_a_two_points:
                scoreTeamA = scoreTeamA + POINTS_FOR_TWO_POINTS;
                break;
            case R.id.team_a_free_points:
                scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;
                break;
            case R.id.team_b_three_points:
                scoreTeamB = scoreTeamB + POINTS_FOR_THREE_POINTS;
                break;
            case R.id.team_b_two_points:
                scoreTeamB = scoreTeamB + POINTS_FOR_TWO_POINTS;
                break;
            case R.id.team_b_free_points:
                scoreTeamB = scoreTeamB + POINTS_FOR_FREE_THROW;
                break;

        }
        TextView scoreTeamATextView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamATextView.setText("" + scoreTeamA);
        TextView scoreTeamBTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamBTextView.setText("" + scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = scoreTeamB = 0;
        TextView scoreTeamATextView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamATextView.setText("" + scoreTeamA);
        TextView scoreTeamBTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamBTextView.setText("" + scoreTeamB);
    }
}
