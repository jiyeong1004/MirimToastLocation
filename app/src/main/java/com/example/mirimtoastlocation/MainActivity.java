package com.example.mirimtoastlocation;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getApplicationContext(), "토스트 연습", Toast.LENGTH_SHORT);
            Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
            int xOffset = (int)(Math.random() * display.getWidth());
            int yOffset = (int)(Math.random() * display.getHeight());
            //toast.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, 70);
            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 70);
            toast.show();
        }
    };
}