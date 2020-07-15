package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int player_win=0,com_win=0;
    boolean active_game=true;

    public void PlayerTap(View view)
    {

        if(active_game) {
            int[] arr = {1, 2, 3};
            int user=-1,comp,i;
            ImageView pic;
            Random r = new Random();
             i = r.nextInt(arr.length);
             comp=arr[i];
            ImageView img = (ImageView) view;
            int tappedImage = Integer.parseInt(img.getTag().toString());

            if (tappedImage == 1) {
                user = 1;
                String idx = "player_img1";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            } else if (tappedImage == 2) {
                user = 2;
                String idx = "player_img2";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            } else if (tappedImage == 3) {
                user = 3;
                String idx = "player_img3";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            }

            if (comp == 1) {

                String idx = "bot_img1";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            } else if (comp == 2) {

                String idx = "bot_img2";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            } else if(comp==3) {

                String idx = "bot_img3";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
            }
            if ((user == 2 && comp == 1 )|| (user == 1 && comp == 3) || (user == 3 && comp == 2)) {
                String idx = "status_loose";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
                com_win++;

                String stx = Integer.toString(com_win);
                String sto = Integer.toString(player_win);

                TextView score1 = findViewById(R.id.bot_score);
                score1.setText(stx);
                TextView score0 = findViewById(R.id.player_score);
                score0.setText(sto);
            } else if((user == 2 && comp == 3 )|| (user == 1 && comp == 2) || (user == 3 && comp == 1))
        {
                String idx = "status_win";
                int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                pic = findViewById(x);
                pic.setAlpha(1f);
                player_win++;

                String stx = Integer.toString(com_win);
                String sto = Integer.toString(player_win);

                TextView score1 = findViewById(R.id.bot_score);
                score1.setText(stx);
                TextView score0 = findViewById(R.id.player_score);
                score0.setText(sto);
            }
            else
            {
                TextView score1 = findViewById(R.id.status_draw);
                score1.setAlpha(1f);
            }

            active_game = false;
        }
    }


    public void cont(View view)
    {
        ImageView pic;
        String idx="status_loose";
        int x = this.getResources().getIdentifier(idx, "id" , getPackageName());
        pic= findViewById(x);
        pic.setAlpha(0f);

        String idx2="status_win";
        int x2 = this.getResources().getIdentifier(idx2, "id" , getPackageName());
        pic= findViewById(x2);
        pic.setAlpha(0f);

            String idx1="player_img1";
            int xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);

             idx1="player_img2";
             xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);

            idx1="player_img3";
            xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);

            idx1="bot_img1";
            xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);

            idx1="bot_img2";
            xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);

            idx1="bot_img3";
            xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
            pic= findViewById(xa);
            pic.setAlpha(0f);
        TextView score1 = findViewById(R.id.status_draw);
        score1.setAlpha(0f);

        active_game=true;

    }

    public void rest(View view)
    {
        ImageView pic;
        String idx="status_loose";
        int x = this.getResources().getIdentifier(idx, "id" , getPackageName());
        pic= findViewById(x);
        pic.setAlpha(0f);

        String idx2="status_win";
        int x2 = this.getResources().getIdentifier(idx2, "id" , getPackageName());
        pic= findViewById(x2);
        pic.setAlpha(0f);

        String idx1="player_img1";
        int xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);

        idx1="player_img2";
        xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);

        idx1="player_img3";
        xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);

        idx1="bot_img1";
        xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);

        idx1="bot_img2";
        xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);

        idx1="bot_img3";
        xa = this.getResources().getIdentifier(idx1, "id" , getPackageName());
        pic= findViewById(xa);
        pic.setAlpha(0f);
        TextView score12 = findViewById(R.id.status_draw);
        score12.setAlpha(0f);
        active_game=true;
        com_win=0;
        player_win=0;
        String stx = Integer.toString(com_win);
        String sto = Integer.toString(player_win);

        TextView score1 = findViewById(R.id.bot_score);
        score1.setText(stx);
        TextView score0 = findViewById(R.id.player_score);
        score0.setText(sto);
    }
}
