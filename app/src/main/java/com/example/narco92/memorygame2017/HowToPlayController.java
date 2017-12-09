package com.example.narco92.memorygame2017;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class HowToPlayController extends AppCompatActivity {

    private TextView text2;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.howtoplay_page);

        text2 = (TextView) findViewById(R.id.VText);




                text2.setTextColor(Color.BLUE);
                text2.setTextSize(26); ;
                text2.setText("Le joueur appuie sur une carte et la carte se retourne . \n" +
                        "Le joueur sélectionne alors une autre carte et la retourne. \n " +
                        "Si les deux cartes sont une paire assortie par exemple deux jacks alors " +
                        "les deux cartes disparaissent et le joueur reçoit un point.\n" +
                        "Si y a plus de cartes qui restent alors la partie est finie.");



            }


}