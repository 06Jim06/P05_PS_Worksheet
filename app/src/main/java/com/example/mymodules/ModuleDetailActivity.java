package com.example.mymodules;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ModuleDetailActivity extends AppCompatActivity {

    TextView Output;
    String value1;
    int value2;
    String value3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Output = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Module Code");

        if(code.equalsIgnoreCase("C346")){
            value1 = intentReceived.getStringExtra("Module Name");
            value2 = intentReceived.getIntExtra("Module Credit",4);
            value3 = intentReceived.getStringExtra("Venue");

        }
        else if(code.equalsIgnoreCase("C206")){
            value1 = intentReceived.getStringExtra("Module Name1");
            value2 = intentReceived.getIntExtra("Module Credit1",4);
            value3 = intentReceived.getStringExtra("Venue1");
        }
        else if(code.equalsIgnoreCase("C218")){
            value1 = intentReceived.getStringExtra("Module Name2");
            value2 = intentReceived.getIntExtra("Module Credit2",4);
            value3 = intentReceived.getStringExtra("Venue2");
        }
        else if(code.equalsIgnoreCase("C203")){
            value1 = intentReceived.getStringExtra("Module Name3");
            value2 = intentReceived.getIntExtra("Module Credit3",4);
            value3 = intentReceived.getStringExtra("Venue3");
        }
        else if(code.equalsIgnoreCase("G953")){
            value1 = intentReceived.getStringExtra("Module Name4");
            value2 = intentReceived.getIntExtra("Module Credit4",4);
            value3 = intentReceived.getStringExtra("Venue4");
        }

        String constant = "\nAcademic Year: 2023\nSemester: 1";
        String display = "Module Code: "+code+"\n"+"Module Name: "+value1+"\n"+"Module Credit: "+value2+constant+"\n"+"Venue: "+value3;
        Output.setText(display);

    }


}