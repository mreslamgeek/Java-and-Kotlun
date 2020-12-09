package com.eslam.javakotlun.myJava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.eslam.javakotlun.R;
import com.eslam.javakotlun.myKotlin.KotlinClass;

public class MainActivity extends AppCompatActivity {

    TextView mytext;
    Button java_btn, kotlin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytext = findViewById(R.id.textView);
        java_btn = findViewById(R.id.java_btn);
        kotlin_btn = findViewById(R.id.kotlin_btn);

        java_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloFromJava(mytext);
            }
        });

        kotlin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KotlinClass kotlinFile = new KotlinClass();
                kotlinFile.hellofromKotlin(mytext);

            }
        });

    }

    private void helloFromJava(TextView myTextView) {
        myTextView.setText("Hello From Java");
    }

}