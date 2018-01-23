package com.example.lenovo.quiz_5;

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

        editText = (EditText)findViewById(R.id.etangka);
        button = (Button)findViewById(R.id.btnhasil);
        textView = (TextView)findViewById(R.id.txthasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nAngka = editText.getText().toString();

                int aAngka = Integer.parseInt(nAngka);

                if (aAngka <= 10) {
                    textView.setText("smaller");
            }else{
                    textView.setText("Bigger");
                }





            }
        });
    }
}
