package com.example.greatestnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// Import this if you want a tost message
// import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumEditText;
    private EditText secondNumEditText;
    private EditText thirdNumEditText;
    private Button findMaxButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumEditText = findViewById(R.id.edt_first_num);
        secondNumEditText = findViewById(R.id.edt_second_num);
        thirdNumEditText = findViewById(R.id.edt_third_num);
        findMaxButton = findViewById(R.id.btn_find_max);
        resultTextView = findViewById(R.id.txt_result);

        findMaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(firstNumEditText.getText().toString());
                int secondNum = Integer.parseInt(secondNumEditText.getText().toString());
                int thirdNum = Integer.parseInt(thirdNumEditText.getText().toString());

                int max = findMax(firstNum, secondNum, thirdNum);
                resultTextView.setText("The greatest number is: " + max);
                //If you add this thid toast message instead of the above code line the output will display in a tost from 
                //Toast.makeText(MainActivity.this, "The greatest number is: " + max, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
