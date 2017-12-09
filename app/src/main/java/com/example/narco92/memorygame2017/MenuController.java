package com.example.narco92.memorygame2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_pqge);

        Button Start = (Button) findViewById(R.id.BStart);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MenuController.this, JeuxController.class);
                MenuController.this.startActivity(MyIntent);
            }
        });

        Button HTPlay = (Button) findViewById(R.id.bhtplay);
        HTPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MenuController.this, HowToPlayController.class);
                MenuController.this.startActivity(MyIntent);
            }
        });

        Button btn1 = (Button) findViewById(R.id.BExit);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }
}
