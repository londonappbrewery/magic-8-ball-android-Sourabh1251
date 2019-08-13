package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask = (Button) findViewById(R.id.button_Ask);



        final ImageView ball = (ImageView) findViewById(R.id.imageView_FortuneTeller);

        final int[] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};



        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ball","Button has been pressed");

                Random randomNumberGenerator = new Random();

                int no = randomNumberGenerator.nextInt(5);
                Log.d("random","Number is"+no);

                ball.setImageResource(ballArray[no]);


            }
        });
    }
}
