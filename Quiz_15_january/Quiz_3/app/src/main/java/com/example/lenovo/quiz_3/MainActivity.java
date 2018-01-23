package com.example.lenovo.quiz_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etJarak, etWaktu;
    Button btnhitung;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etJarak = (EditText)findViewById(R.id.etjarak);
        etWaktu = (EditText)findViewById(R.id.etwaktu);
        btnhitung = (Button) findViewById(R.id.btnhitung);
        textView = (TextView)findViewById(R.id.txthasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String njarak = etJarak.getText().toString();
                String nwaktu = etWaktu.getText().toString();

                int ajarak = Integer.parseInt(njarak);
                int awaktu = Integer.parseInt(nwaktu);

                int hasiltadi = (ajarak/awaktu);

                textView.setText("Waktu = " + hasiltadi);

            }
        });
    }
}
