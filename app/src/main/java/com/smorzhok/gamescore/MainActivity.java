package com.smorzhok.gamescore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;
    private TextView score1;
    private TextView score2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "OnCreate Method");
        score1 = findViewById(R.id.textViewGoalsTeam1);
        score2 = findViewById(R.id.textViewGoalsTeam2);
        try {
            scoreTeam1 = savedInstanceState.getInt("scoreTeam1");
            scoreTeam2 = savedInstanceState.getInt("scoreTeam2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        updateScore1();
        updateScore2();

        score1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeam1++;
                updateScore1();
                Log.d("MainActivity", "Clicked on 1 Team");
            }
        });
        score2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeam2++;
                updateScore2();
                Log.d("MainActivity", "Clicked on 2 Team");
            }
        });

    }
    private void updateScore1(){
        score1.setText("" + scoreTeam1);
    }
    private void updateScore2(){
        score2.setText("" + scoreTeam2);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeam1", scoreTeam1);
        outState.putInt("scoreTeam2", scoreTeam2);
        Log.d("MainActivity", "onSaveInstanceState Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }
}