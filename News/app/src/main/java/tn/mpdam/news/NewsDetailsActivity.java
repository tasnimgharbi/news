package tn.mpdam.news;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        String newsTitle = getIntent().getStringExtra("title");
        String newsDescription = getIntent().getStringExtra("description");
        int newsImageResource = getIntent().getIntExtra("imageResource", 0);

        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        ImageView imageView = findViewById(R.id.imageView);

        titleTextView.setText(newsTitle);
        descriptionTextView.setText(newsDescription);

        if (newsImageResource != 0) {
            imageView.setImageResource(newsImageResource);
        }
    }
}

