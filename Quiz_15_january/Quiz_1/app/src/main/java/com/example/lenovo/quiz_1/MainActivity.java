package com.example.lenovo.quiz_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etangka);
        button = (Button) findViewById(R.id.btnok);
        textView = (TextView) findViewById(R.id.txthasil);

    }

    public void proses(View view) {
        String nangka = textView.getText().toString();

        int aAngka = Integer.parseInt(nangka);

        if (aAngka >= 1 && aAngka <= 9) {
            textView.setText("Not Null");
        } else if (aAngka == 0) {
            textView.setText("Null");

        }

    }
}