package com.example.android.basketballscore;


        import android.content.res.Resources;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.net.Uri;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHomeTeam = 0 ;
    int scoreGuestTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeamScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points for Home team.
     */
    public void addThreeForAHomeTeam (View view){
        displayForHomeTeam(3);
        scoreHomeTeam = scoreHomeTeam + 3;
        displayForHomeTeam(scoreHomeTeam);

    }
    /**
     * Add 2 points for Home team.
     */
    public void addTwoForHomeTeam (View view){
        displayForHomeTeam(2);
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }
    /**
     * Add 1 points for Home team.
     */
    public void addOneForHomeTeam (View view){
        displayForHomeTeam(1);
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Displays the given score for Guest team.
     */
    public void displayForGuestTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_team_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add 3 points for Guest team.
     */
    public void addThreeForAGuestTeam (View view){
        displayForGuestTeam(3);
        scoreGuestTeam = scoreGuestTeam + 3;
        displayForGuestTeam(scoreGuestTeam);

    }
    /**
     * Add 2 points for Guest team.
     */
    public void addTwoForAGuestTeam (View view){
        displayForGuestTeam(2);
        scoreGuestTeam = scoreGuestTeam + 2;
        displayForGuestTeam(scoreGuestTeam);
    }
    /**
     * Add 1 points for Guest team.
     */
    public void addOneForAGuestTeam (View view){
        displayForGuestTeam(1);
        scoreGuestTeam = scoreGuestTeam + 1;
        displayForGuestTeam(scoreGuestTeam);
    }

    /**
     *  reset score for both teams to 0
     */
    public void resetScore (View view){
        int resetScore;
        resetScore = scoreHomeTeam = 0;
        resetScore = scoreGuestTeam = 0;
        displayForHomeTeam(resetScore);
        displayForGuestTeam(resetScore);



    }



}

