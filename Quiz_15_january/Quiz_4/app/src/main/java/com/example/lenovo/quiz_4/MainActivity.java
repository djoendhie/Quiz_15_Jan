package com.example.lenovo.quiz_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.txthasil);
        editText1 = (EditText)findViewById(R.id.etalas);
        editText2 = (EditText)findViewById(R.id.ettinggi);
        button = (Button)findViewById(R.id.btnhitung);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String atext1 = editText1.getText().toString();
                String atext2 = editText1.getText().toString();

                if (atext1.isEmpty()){
                    editText1.setError("jgn Kosong");
                }else if (atext2.isEmpty()) {
                    editText2.setError("jgn Kosong");
                }

                int nalas = Integer.parseInt(atext1);
                int ntinggi = Integer.parseInt(atext2);

                int hitung = ((nalas * ntinggi) / 2);

                textView.setText("hasil = " + hitung);
            }
        });
    }
}
