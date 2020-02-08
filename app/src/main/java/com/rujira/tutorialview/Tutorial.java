package com.rujira.tutorialview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class Tutorial extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tutorial);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        addFragment(new Step.Builder().setTitle("Money Title")
                .setContent("Money Content")
                .setSummary("Money Summary")
                .setDrawable(R.drawable.ic_attach_money_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());
        addFragment(new Step.Builder().setTitle("Music Title")
                .setContent("Music Content")
                .setSummary("Music Summary")
                .setDrawable(R.drawable.ic_audiotrack_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());
        addFragment(new Step.Builder().setTitle("Timer Title")
                .setContent("Timer Content")
                .setSummary("Timer Summary")
                .setDrawable(R.drawable.ic_av_timer_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.prev:
                Toast.makeText(this, "Back button clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
