package test.test.letswhatsapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryActivity extends AppCompatActivity {

    TextView tvPhoneNumberHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        tvPhoneNumberHistory = findViewById(R.id.tvPhoneNumberHistory);

        SharedPreferences sharedPreferences = getSharedPreferences("PhoneNumberHistory", MODE_PRIVATE);
        String history = sharedPreferences.getString("phoneNumbers", "");
        tvPhoneNumberHistory.setText(history.replace(",", "\n"));
    }
}

