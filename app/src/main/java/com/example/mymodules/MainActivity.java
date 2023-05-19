package com.example.mymodules;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AndroidProg;
        Button SoftDev;
        Button UIUX;
        Button WebDevphp;
        Button lifeSkill;

        AndroidProg = findViewById(R.id.C346);
        SoftDev = findViewById(R.id.C206);
        UIUX = findViewById(R.id.C218);
        WebDevphp = findViewById(R.id.C203);
        lifeSkill = findViewById(R.id.G953);

        AndroidProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","C346 Android Programming");
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","E63A");
                startActivity(intent);
            }
        });

        SoftDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C206");
                intent.putExtra("Module Name1","C206 Software Development Process");
                intent.putExtra("Module Credit1",4);
                intent.putExtra("Venue1","W64M");
                startActivity(intent);
            }
        });

        UIUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C218");
                intent.putExtra("Module Name2","C218 UI/UX Design for Apps");
                intent.putExtra("Module Credit2",4);
                intent.putExtra("Venue2","W64M");
                startActivity(intent);
            }
        });

        WebDevphp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C203");
                intent.putExtra("Module Name3","Web Appln Development in php");
                intent.putExtra("Module Credit3",4);
                intent.putExtra("Venue3","E63A");
                startActivity(intent);
            }
        });

        lifeSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","G953");
                intent.putExtra("Module Name4","G953 Life Skills III");
                intent.putExtra("Module Credit4",1);
                intent.putExtra("Venue4","HB02");
                startActivity(intent);
            }
        });
    }
}