package com.vornes.prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObrigadoActivity.class);
                Bundle params = new Bundle();
                params.putString("name", "The Last of Us");
                params.putString("img", "game1");
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        Button bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObrigadoActivity.class);
                Bundle params = new Bundle();
                params.putString("name", "Tomb Raider");
                params.putString("img", "game2");
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        Button bt3 = (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObrigadoActivity.class);
                Bundle params = new Bundle();
                params.putString("name", "GTA V");
                params.putString("img", "game3");
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        Button bt4 = (Button) findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObrigadoActivity.class);
                Bundle params = new Bundle();
                params.putString("name", "Battlefield 4");
                params.putString("img", "game4");
                intent.putExtras(params);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Toast.makeText(getApplicationContext(), "Michael Vornes 2017" , Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
