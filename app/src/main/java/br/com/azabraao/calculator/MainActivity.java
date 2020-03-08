package br.com.azabraao.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        radioGroup = findViewById(R.id.radioGroup);

    }

    public void sum(View view) {
        try {
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);

            String operation = radioButton.getText().toString();
            String strNum1 = firstNumber.getText().toString();
            String strNum2 = secondNumber.getText().toString();

            Double num1 = Double.parseDouble(strNum1);
            Double num2 = Double.parseDouble(strNum2);

            Double total = 0.0;
            switch (operation) {
                case "sum":
                    total = num1 + num2;
                    break;
                case "multiply":
                    total = num1 * num2;
                    break;
                case "divide":
                    total = num1 / num2;
                    break;
                case "subtract":
                    total = num1 - num2;
                    break;
            }


            Toast.makeText(this, "O resultado é: " + total, Toast.LENGTH_SHORT).show();
        } catch(Exception e) {
            Toast.makeText(this, "Verifique ", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    public void checkButton(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}
