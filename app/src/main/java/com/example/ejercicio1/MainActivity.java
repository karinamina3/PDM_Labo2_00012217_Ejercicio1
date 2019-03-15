package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button click;
    private TextView text;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button click = findViewById(R.id.click);
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final TextView text = findViewById(R.id.text);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(username.getText());
            }
        });

        click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                text.setText(password.getText());
                return false;
            }
        });

    }
}
