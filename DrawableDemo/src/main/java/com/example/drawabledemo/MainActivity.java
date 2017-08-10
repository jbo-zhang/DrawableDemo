package com.example.drawabledemo;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((ImageView)findViewById(R.id.image_view)).setImageLevel(1);

//        ScaleDrawable background = (ScaleDrawable) findViewById(R.id.image_view).getBackground();
//        //drawable的默认等级是0，等级为0 scaledrawable不显示
//        background.setLevel(1);

        ClipDrawable background = (ClipDrawable) findViewById(R.id.image_view).getBackground();
        //drawable的默认等级是0（共10000），等级为0 ClipDrawable表示完全裁剪
        background.setLevel(10000);

        CustomDrawable customDrawable = new CustomDrawable(Color.MAGENTA);
        findViewById(R.id.image_view).setBackgroundDrawable(customDrawable);


        final ImageView iv = (ImageView) findViewById(R.id.image_view);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScaleAnimation scale = new ScaleAnimation(1f, 0.2f, 1f, 0.2f);
                scale.setDuration(2000);
                iv.startAnimation(scale);
            }
        });


    }

}
