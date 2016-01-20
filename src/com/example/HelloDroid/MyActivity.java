package com.example.HelloDroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView message;
    private ImageView sox;
    private View.OnClickListener soxTapListener;
    private int counter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        initApp();
    }

    private void initApp() {
        message = (TextView) findViewById(R.id.message);
        sox = (ImageView) findViewById(R.id.sox);

        soxTapListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapSox();
            }
        };
        sox.setOnClickListener(soxTapListener);
    }

    private void tapSox() {
        ++counter;
        String temp;

        switch (counter) {
            case 1:
                temp = "Hey!"; break;
            case 2:
                temp = "Watch it buddy!"; break;
            default:
                temp = "That's " + counter + " times!  I said no touchy!";
        }
        message.setText(temp);
    }
}
