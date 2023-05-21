package test.test.letswhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {



    // Color: #9DDF53

    EditText phoneNumber;
    Button letsChatting;
    String whatsLink;
    Button btnViewHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatsLink = "https://wa.me/";

        phoneNumber = (EditText) findViewById(R.id.edt);
        letsChatting = (Button) findViewById(R.id.btn);

        // Add the code for btnViewHistory here
        Button btnViewHistory = findViewById(R.id.btnViewHistory);
        btnViewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });


        letsChatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String page = phoneNumber.getText().toString();
                if (!TextUtils.isEmpty(page)) {
                    savePhoneNumberToHistory(page); // Save the phone number to history

                    Uri webpage = Uri.parse(whatsLink + "/" + page);
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(intent);
                } else {
                    // Show a Toast message when the phone number field is empty
                    Toast.makeText(MainActivity.this, "The number is empty. Please enter the Phone Number!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private boolean isValidPhoneNumber(String phoneNumber) {
        // Adjust the pattern to match your desired phone number format
        Pattern pattern = Pattern.compile("^\\d{10,}$");
        return !TextUtils.isEmpty(phoneNumber) && pattern.matcher(phoneNumber).matches();
    }

    private void savePhoneNumberToHistory(String phoneNumber) {
        SharedPreferences sharedPreferences = getSharedPreferences("PhoneNumberHistory", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String history = sharedPreferences.getString("phoneNumbers", "");
        String updatedHistory = history + phoneNumber + ",";
        editor.putString("phoneNumbers", updatedHistory);
        editor.apply();
    }
}