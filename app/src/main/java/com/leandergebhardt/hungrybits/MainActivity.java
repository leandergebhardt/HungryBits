package com.leandergebhardt.hungrybits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViews();
        startersCard.setOnClickListener(v -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
            startActivity(startersActivityIntent);
        });
        mainsCard.setOnClickListener(v -> {
            Intent mainCoursesIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesIntent);
        });
        dessertsCard.setOnClickListener(v -> {
            Intent dessertsIntent = new Intent(MainActivity.this, DessertActivity.class);
            startActivity(dessertsIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email);
        String email = emailTextView.getText().toString();
        emailTextView.setOnClickListener(v -> {
            Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
            launchEmailAppIntent.setData(Uri.parse("mailto:" + email)); // only email apps should handle this
        });
    }

    private void findViews() {
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main);
        dessertsCard = findViewById(R.id.card_view_desserts);
    }
}