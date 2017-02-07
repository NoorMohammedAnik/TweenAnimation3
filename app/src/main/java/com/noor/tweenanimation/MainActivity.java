package com.noor.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnimatedText;
    ImageView imgIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnimatedText=(TextView)findViewById(R.id.txtAnimatedText);
        imgIcon=(ImageView)findViewById(R.id.imageView);





        txtAnimatedText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //load animation
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtAnimatedText.startAnimation(rotate);

            }
        });







        txtAnimatedText.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtAnimatedText.clearAnimation();
                return true;
            }
        });


        imgIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load animation
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imgIcon.startAnimation(rotate);
            }
        });

        imgIcon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imgIcon.clearAnimation();  // for stop animation
                return true;
            }
        });
    }
}
