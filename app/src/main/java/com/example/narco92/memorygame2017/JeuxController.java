package com.example.narco92.memorygame2017;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import static com.example.narco92.memorygame2017.R.raw.noel;


public class JeuxController extends AppCompatActivity {

    MediaPlayer myMusic;
    protected void onPause(){
        super.onPause();
        myMusic.release();
    }


    TextView tv_p1;

    ImageView v_11, v_12, v_13, v_14,v_21, v_22, v_23, v_24, v_31, v_32, v_33, v_34;

    // tableau pour les images
    int[] cardSArray = new int[]{101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};


    // réel images
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203,  image204, image205, image206;

    int firstCard,secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;



    int playerPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeux_page);
        myMusic = MediaPlayer.create(this, R.raw.noel);
        //if(!(myMusic.isPlaying())){
            myMusic.start();
            myMusic.setLooping(true);
        //}


        tv_p1 = (TextView) findViewById(R.id.tv_p1);

        tv_p1.setText("Score: "+playerPoints);

        v_11 = (ImageView) findViewById(R.id.v_11);
        v_12 = (ImageView) findViewById(R.id.v_12);
        v_13 = (ImageView) findViewById(R.id.v_13);
        v_14 = (ImageView) findViewById(R.id.v_14);
        v_21 = (ImageView) findViewById(R.id.v_21);
        v_22 = (ImageView) findViewById(R.id.v_22);
        v_23 = (ImageView) findViewById(R.id.v_23);
        v_24 = (ImageView) findViewById(R.id.v_24);
        v_31 = (ImageView) findViewById(R.id.v_31);
        v_32 = (ImageView) findViewById(R.id.v_32);
        v_33 = (ImageView) findViewById(R.id.v_33);
        v_34 = (ImageView) findViewById(R.id.v_34);


        v_11.setTag("0");
        v_12.setTag("1");
        v_13.setTag("2");
        v_14.setTag("3");
        v_21.setTag("4");
        v_22.setTag("5");
        v_23.setTag("6");
        v_24.setTag("7");
        v_31.setTag("8");
        v_32.setTag("9");
        v_33.setTag("10");
        v_34.setTag("11");

        //charger les images de la carte
        frontOfCardsResources();

        // mélanger les images
        Collections.shuffle(Arrays.asList(cardSArray));




        v_11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_11, theCard);


            }
        });
        v_12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_12, theCard);

            }
        });
        v_13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_13, theCard);

            }
        });

        v_14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_14, theCard);

            }
        });
        v_21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_21, theCard);

            }
        });
        v_22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_22, theCard);

            }
        });
        v_23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_23, theCard);

            }
        });

        v_24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_24, theCard);

            }
        });

        v_31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_31, theCard);

            }
        });

        v_32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_32, theCard);

            }
        });

        v_33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_33, theCard);

            }
        });

        v_34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(v_34, theCard);

            }
        });



    }

    private void doStuff(ImageView v, int card) {


        // définir l'image correcte à imageview
        if (cardSArray[card] == 101) {
            v.setImageResource(image101);
        } else if (cardSArray[card] == 102) {
            v.setImageResource(image102);
        } else if (cardSArray[card] == 103) {
            v.setImageResource(image103);
        } else if (cardSArray[card] == 104) {
            v.setImageResource(image104);
        } else if (cardSArray[card] == 105) {
            v.setImageResource(image105);
        } else if (cardSArray[card] == 106) {
            v.setImageResource(image106);
        } else if (cardSArray[card] == 201) {
            v.setImageResource(image201);
        } else if (cardSArray[card] == 202) {
            v.setImageResource(image202);
        } else if (cardSArray[card] == 203) {
            v.setImageResource(image203);
        } else {if (cardSArray[card] == 204) {
            v.setImageResource(image204);
        } else if (cardSArray[card] == 205) {
            v.setImageResource(image205);
        } else if (cardSArray[card] == 206) {
            v.setImageResource(image206);
        }
        }

        //vérifier quelle image est sélectionnée et l'enregistrer dans la variable tomporaire
        if (cardNumber == 1){
            firstCard = cardSArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            v.setEnabled(false);
        } else if (cardNumber == 2){
            secondCard = cardSArray[card];
            if (secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;
            v_11.setEnabled(false);
            v_12.setEnabled(false);
            v_13.setEnabled(false);
            v_14.setEnabled(false);
            v_21.setEnabled(false);
            v_22.setEnabled(false);
            v_23.setEnabled(false);
            v_24.setEnabled(false);
            v_31.setEnabled(false);
            v_32.setEnabled(false);
            v_33.setEnabled(false);
            v_34.setEnabled(false);

            Handler handler = new Handler() {
                @Override
                public void publish(LogRecord record) {

                }

                @Override
                public void flush() {

                }

                @Override
                public void close() throws SecurityException {

                }
            };
            v.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //vérifier si l'image sélectionnée est égale
                    calculate();
                }
            }, 1000);
        }
    }
    private void calculate () {
        //si l'image est égale supprimer tgem et ajouter un point
        if (firstCard == secondCard) {
            Toast.makeText(this,"bien",Toast.LENGTH_SHORT).show();
            if (clickedFirst == 0) {
                v_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                v_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                v_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                v_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                v_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                v_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                v_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                v_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                v_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                v_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                v_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                v_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                v_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                v_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                v_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                v_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                v_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                v_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                v_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                v_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                v_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                v_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                v_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                v_34.setVisibility(View.INVISIBLE);
            }
            //ajouter des points au bon joueur

            playerPoints++;
            tv_p1.setText("Score: " + playerPoints);

        } else {
            Toast.makeText(this,"réessayez !!",Toast.LENGTH_SHORT).show();
            v_11.setImageResource(R.drawable.ic_back);
            v_12.setImageResource(R.drawable.ic_back);
            v_13.setImageResource(R.drawable.ic_back);
            v_14.setImageResource(R.drawable.ic_back);
            v_21.setImageResource(R.drawable.ic_back);
            v_22.setImageResource(R.drawable.ic_back);
            v_23.setImageResource(R.drawable.ic_back);
            v_24.setImageResource(R.drawable.ic_back);
            v_31.setImageResource(R.drawable.ic_back);
            v_32.setImageResource(R.drawable.ic_back);
            v_33.setImageResource(R.drawable.ic_back);
            v_34.setImageResource(R.drawable.ic_back);





        }

        v_11.setEnabled(true);
        v_12.setEnabled(true);
        v_13.setEnabled(true);
        v_14.setEnabled(true);
        v_21.setEnabled(true);
        v_22.setEnabled(true);
        v_23.setEnabled(true);
        v_24.setEnabled(true);
        v_31.setEnabled(true);
        v_32.setEnabled(true);
        v_33.setEnabled(true);
        v_34.setEnabled(true);

        //vérifier si le jeu est terminé
        checkEnd();
        /*while (fin == false){
            if(!(myMusic.isPlaying())){myMusic.start();}
        }*/
    }
    private void checkEnd () {
        if (v_11.getVisibility() == View.INVISIBLE &&
                v_12.getVisibility() == View.INVISIBLE &&
                v_13.getVisibility() == View.INVISIBLE &&
                v_14.getVisibility() == View.INVISIBLE &&
                v_21.getVisibility() == View.INVISIBLE &&
                v_22.getVisibility() == View.INVISIBLE &&
                v_23.getVisibility() == View.INVISIBLE &&
                v_24.getVisibility() == View.INVISIBLE &&
                v_31.getVisibility() == View.INVISIBLE &&
                v_32.getVisibility() == View.INVISIBLE &&
                v_33.getVisibility() == View.INVISIBLE &&
                v_34.getVisibility() == View.INVISIBLE) {
            //fin = true;


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(JeuxController.this);
            alertDialogBuilder
                    .setMessage("fin!\nScore: " + playerPoints)
                    .setCancelable(false)
                    .setPositiveButton("NOUVEAU", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface DialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), JeuxController.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface DialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }

    }



    private void frontOfCardsResources(){

        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }
}

