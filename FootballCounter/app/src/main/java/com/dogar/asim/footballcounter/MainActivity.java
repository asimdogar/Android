package com.dogar.asim.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addScore(View view) {
        switch (view.getId()) {
            case R.id.team_a_points:
                scoreTeamA = scoreTeamA + 1;
                break;
            case R.id.team_b_points:
                scoreTeamB = scoreTeamB + 1;
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
