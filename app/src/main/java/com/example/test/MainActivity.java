package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNumOne, etNumTwo;
    private Button btnSum, btnSubtract, btnDivide;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumOne = findViewById(R.id.etNumOne);
        etNumTwo = findViewById(R.id.etNumTwo);
        btnSum = findViewById(R.id.btnSum);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arithmetic arithmetic = new Arithmetic();
                float numOne = Float.valueOf(etNumOne.getText().toString());
                float numTwo = Float.valueOf(etNumTwo.getText().toString());
                float result = arithmetic.add(numOne, numTwo);
                tvResult.setText(result + "");
            }
        });
    }
}
