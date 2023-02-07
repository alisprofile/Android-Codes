package com.example.useradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// Start of Greatest number

    private EditText firstNumEditText;
    private EditText secondNumEditText;
    private EditText thirdNumEditText;
    private Button findMaxButton;
    private TextView resultTextView;

//End of Greatest number

    private RadioGroup genderRadioGroup;
    private RadioButton maleRadioButton;
    private RadioButton femaleRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        genderRadioGroup = findViewById(R.id.gender_radio_group);
        maleRadioButton = findViewById(R.id.male_radio_button);
        femaleRadioButton = findViewById(R.id.female_radio_button);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedGender;
                if (checkedId == R.id.male_radio_button) {
                    selectedGender = "Greatest";
                } else if (checkedId == R.id.female_radio_button) {
                    selectedGender = "Smallest";
                } else {
                    selectedGender = "Not selected";
                }
                Toast.makeText(getApplicationContext(), "Selected Gender: " + selectedGender, Toast.LENGTH_SHORT).show();
            }
        });
    }
}