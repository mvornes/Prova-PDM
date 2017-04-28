package com.vornes.prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ObrigadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrigado);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();

        String result = getResources().getString(R.string.result);

        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(result + params.getString("name"));

    }
}
