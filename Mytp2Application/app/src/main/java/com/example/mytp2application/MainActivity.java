package com.example.mytp2application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    MediaPlayer mp=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img=(ImageView) findViewById(R.id.imageView9);
        final ImageView imgg=(ImageView) findViewById(R.id.imageView3);
        final ImageView imggg=(ImageView) findViewById(R.id.imageView5);
        final ImageView img2=(ImageView) findViewById(R.id.imageView8);
        final ImageView img21=(ImageView) findViewById(R.id.imageView7);
        final ImageView img22=(ImageView) findViewById(R.id.imageView6);
        final ImageView img3=(ImageView) findViewById(R.id.imageView13);
        final ImageView img31=(ImageView) findViewById(R.id.imageView12);
        final ImageView img32=(ImageView) findViewById(R.id.imageView11);
        final HorizontalScrollView H1=(HorizontalScrollView) findViewById(R.id.H1);
        final HorizontalScrollView H2=(HorizontalScrollView) findViewById(R.id.H2);
        final HorizontalScrollView H3=(HorizontalScrollView) findViewById(R.id.H3);


        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.anim1);

        img.startAnimation(animation);
        imgg.startAnimation(animation);
        imggg.startAnimation(animation);
        img2.startAnimation(animation);

        img3.startAnimation(animation);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"5000 DA", Toast.LENGTH_SHORT).show();
            }

    });

        imgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"5000 DA", Toast.LENGTH_SHORT).show();
            }

        });
        imggg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"5000 DA", Toast.LENGTH_SHORT).show();
            }

        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"3500 DA", Toast.LENGTH_SHORT).show();
            }

        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"7000 DA", Toast.LENGTH_SHORT).show();
            }

        });

imgg.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {

        Intent test=new Intent(MainActivity.this,Details.class);
        test.putExtra("var",0);
        startActivity(test);


        return true;
    }
});
img2.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {

        Intent test=new Intent(MainActivity.this,Details.class);
        test.putExtra("var",2);
        startActivity(test);


        return true;
    }
});
 img3.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        Intent test=new Intent(MainActivity.this,Details.class);
        test.putExtra("var",1);
        startActivity(test);



        return true;
    }
});




    }

    @Override
    protected void onResume() {
        super.onResume();


        if (mp==null)
            mp=MediaPlayer.create(MainActivity.this,R.raw.song);

        if (!mp.isPlaying())
            mp.start();
    }
    @Override
    protected void onPause() {

        super.onPause();
        mp.pause();
    }


    protected void onSaveInstanceState(Bundle out) {
        super.onSaveInstanceState(out);

    }
}
