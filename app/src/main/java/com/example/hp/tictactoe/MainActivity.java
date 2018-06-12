package com.example.hp.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int myActivePlayer =0  ;
int[] GameLogic = {2,2,2,2,2,2,2,2,2};

    public void onTap(View view){


    ImageView myTapped = (ImageView) view;
        int tappedImgTag = Integer.parseInt(myTapped.getTag().toString());
        if (GameLogic[tappedImgTag] == 2) {
            GameLogic[tappedImgTag] = myActivePlayer ;

    if (myActivePlayer == 0) {
        myTapped.setImageResource(R.drawable.cross);
        myTapped.animate().rotation(360).setDuration(500);
        myActivePlayer = 1;
    } else {
        myTapped.setImageResource(R.drawable.circle);
        myTapped.animate().rotation(360).setDuration(500);
        myActivePlayer = 0;
    }
}
else {
            Log.i("position" , " space occupied");

        }
    }



    public void playAgain(View view) {
        for (int i = 0; i < GameLogic.length; i++) {
            GameLogic[i] = 2;
        }

        myActivePlayer = 0;
        LinearLayout linearLayoutOne = (LinearLayout) findViewById(R.id.lineOne);
        LinearLayout linearLayoutTwo = (LinearLayout) findViewById(R.id.lineTwo);
        LinearLayout linearLayoutThree = (LinearLayout) findViewById(R.id.lineThree);
        for (int f = 0; f< linearLayoutOne.getChildCount(); f++) {
        ((ImageView) linearLayoutOne.getChildAt(f)).setImageResource(R.mipmap.ic_launcher);
        }



   for (int g = 0; g< linearLayoutOne.getChildCount(); g++) {
        ((ImageView) linearLayoutTwo.getChildAt(g)).setImageResource(R.mipmap.ic_launcher);
    }

   for (int h = 0; h< linearLayoutOne.getChildCount(); h++) {
       ((ImageView) linearLayoutThree.getChildAt(h)).setImageResource(R.mipmap.ic_launcher);
   }

//yash

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
