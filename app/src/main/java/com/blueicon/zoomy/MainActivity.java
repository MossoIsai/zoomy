package com.blueicon.zoomy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ablanco.zoomy.Zoomy;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = (ImageView)findViewById(R.id.image);


        Zoomy.Builder zoomy =  new Zoomy.Builder(this).target(imagen);
        zoomy.register();

    }
}
