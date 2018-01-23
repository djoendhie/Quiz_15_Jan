package com.example.lenovo.quiz_2;

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

        editText = (EditText)findViewById(R.id.etkerja);
        button = (Button) findViewById(R.id.btnok);
        textView = (TextView) findViewById(R.id.txthasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nkerja = editText.getText().toString();

                if (nkerja.equalsIgnoreCase("1") ){
                    textView.setText("Jurusan Manajemen Informatika");
                }else if (nkerja.equalsIgnoreCase("2") ){
                    textView.setText("Teknik Komputer");
                }else if (nkerja.equalsIgnoreCase("3") ){
                    textView.setText(" Jurusan Akutansi");
                }else if (nkerja.equalsIgnoreCase("4") ){
                    textView.setText(" Jurusan Sistem Informasi");
                }else if (nkerja.equalsIgnoreCase("5") ){
                    textView.setText("  Jurusan Teknologi Informasi");
                }else {
                    textView.setText("Please input number 1-5");
                    textView.setError("Please input number 1-5");
            }
            }
        });
    }
}
