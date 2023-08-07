package com.cinar.radiobtn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView resim;
    TextView yazi;
    RadioButton seç1;
    RadioButton seç2;

    RadioGroup group;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resim = findViewById(R.id.imageView);
        yazi = findViewById(R.id.textView);
        seç1 = findViewById(R.id.radioButton);
        seç2 = findViewById(R.id.radioButton2);

        layout =findViewById(R.id.layout1);

        seç1.setText("Fenerbahçe");
        seç2.setText("Türkiye");




    }
    public  void gonder  (View view) {
        if (seç1.isChecked()){
            layout.setBackgroundColor(Color.BLUE);
            resim.setImageResource(R.drawable.fb);
            yazi.setText("Fenerbahçe");
        }
        else if(seç2.isChecked()){
            layout.setBackgroundColor(Color.RED);
            resim.setImageResource(R.drawable.tr);
            yazi.setText("Türkiye");
        }
    }
    public  void group(View view){
        if (seç1.isChecked()){
            layout.setBackgroundColor(Color.BLUE);
            resim.setImageResource(R.drawable.fb);
            yazi.setText("Fenerbahçe");
        }
        else if(seç2.isChecked()){
            layout.setBackgroundColor(Color.RED);
            resim.setImageResource(R.drawable.tr);
            yazi.setText("Türkiye");
        }
    }
}