// File name: app/src/main/java/com/example/dualnbackgame/MainActivity.java

package com.example.dualnbackgame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView scoreText;
    private Button startButton;
    private Button[] gridButtons;
    private Button audioMatchButton;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreText = findViewById(R.id.scoreText);
        startButton = findViewById(R.id.startButton);
        audioMatchButton = findViewById(R.id.audioMatchButton);

        gridButtons = new Button[9];
        for (int i = 0; i < 9; i++) {
            String buttonID = "gridButton" + (i + 1);
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            gridButtons[i] = findViewById(resID);
        }

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });
    }

    private void startGame() {
        // TODO: Implement game logic
        score = 0;
        updateScore();
    }

    private void updateScore() {
        scoreText.setText("Score: " + score);
    }
}
