package com.mirea.zhokovaa.lesson1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter7);

        tvOut = findViewById(R.id.textView2);
        buttonOk = findViewById((R.id.button14));
        buttonCancel = findViewById(R.id.button21);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка OK");
            }
        };

        buttonOk.setOnClickListener(oclBtnOk);
    }

    public void setName() {
    }

    public void onMyButtonClick(View view) {
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        tvOut.setText("Нажата кнопка CANCEL");

    }
}