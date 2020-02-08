package com.rujira.tutorialview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTutorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        btnTutorial = (Button) findViewById(R.id.btnTutorial);
        btnTutorial.setOnClickListener(btnTutorialListener);
    }

    View.OnClickListener btnTutorialListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view == btnTutorial){
                Intent tutorial = new Intent(MainActivity.this, Tutorial.class);
                startActivity(tutorial);

            }
        }
    };
}
