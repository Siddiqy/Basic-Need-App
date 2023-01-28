package com.apu.samiul.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnFood;
    ImageButton btnClothing;
    ImageButton btnHotel;
    ImageButton btnEducation;
    ImageButton btnMedical;
    ImageButton btnBustop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFood = findViewById(R.id.btnFood);
        btnClothing = findViewById(R.id.btnClothing);
        btnHotel = findViewById(R.id.btnHotel);
        btnEducation = findViewById(R.id.btnEducation);
        btnMedical = findViewById(R.id.btnMedical);
        btnBustop = findViewById(R.id.btnBustop);

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent food = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                food.putExtra("id","From_Activity_Food");
                MainActivity.this.startActivity(food);
            }
        });


        btnClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent clothing = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                clothing.putExtra("id","From_Activity_Clothing");
                MainActivity.this.startActivity(clothing);
            }
        });

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hotel = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                hotel.putExtra("id","From_Activity_Hotel");
                MainActivity.this.startActivity(hotel);
            }
        });

        btnEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent education = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                education.putExtra("id","From_Activity_Education");
                MainActivity.this.startActivity(education);
            }
        });

        btnMedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent medical = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                medical.putExtra("id","From_Activity_Medical");
                MainActivity.this.startActivity(medical);
            }
        });

        btnBustop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bustop = new Intent(MainActivity.this,com.apu.samiul.finalyearproject.MapsActivity.class);
                bustop.putExtra("id","From_Activity_Bustop");
                MainActivity.this.startActivity(bustop);
            }
        });

    }
}
