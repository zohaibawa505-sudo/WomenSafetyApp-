package com.womensafety.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Women Safety App");
        text.setTextSize(25);
        text.setGravity(17);

        setContentView(text);
    }
          }
