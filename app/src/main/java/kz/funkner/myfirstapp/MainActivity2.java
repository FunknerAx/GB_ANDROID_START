package kz.funkner.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.firstTaskButton);
        Button buttonLog = findViewById(R.id.logDataButton);
        final EditText fioEditText = findViewById(R.id.fioEditText);
        final EditText phoneEditText = findViewById(R.id.phoneEditText);
        final EditText numberEditText = findViewById(R.id.numberEditText);
        final EditText emailEditText = findViewById(R.id.emailEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("TASK2", "ФИО: " + fioEditText.getText().toString() +
                        "\nТелефон: " + phoneEditText.getText().toString() +
                        "\nНомер документа: " + numberEditText.getText().toString() +
                        "\nEmail: " + emailEditText.getText().toString());
            }
        });
    }
}