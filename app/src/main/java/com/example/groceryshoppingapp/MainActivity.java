package com.example.groceryshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int num1;
        setContentView(R.layout.activity_main);
        EditText item1 = findViewById(R.id.item1price);
        String strItem1 = item1.getText().toString();
        num1 = Integer.parseInt(strItem1);

        int num2;
        setContentView(R.layout.activity_main);
        EditText item2 = findViewById(R.id.item2price);
        String strItem2 = item2.getText().toString();
        num2 = Integer.parseInt(strItem2);

        int num3;
        setContentView(R.layout.activity_main);
        EditText item3 = findViewById(R.id.item3price);
        String strItem3 = item3.getText().toString();
        num3 = Integer.parseInt(strItem3);

        int num4;
        setContentView(R.layout.activity_main);
        EditText item4 = findViewById(R.id.item4price);
        String strItem4 = item4.getText().toString();
        num4 = Integer.parseInt(strItem4);

        int num5;
        setContentView(R.layout.activity_main);
        EditText item5 = findViewById(R.id.item5price);
        String strItem5 = item5.getText().toString();
        num5 = Integer.parseInt(strItem5);

        int num6;
        setContentView(R.layout.activity_main);
        EditText item6 = findViewById(R.id.item6price);
        String strItem6 = item6.getText().toString();
        num6 = Integer.parseInt(strItem6);

        int num7;
        setContentView(R.layout.activity_main);
        EditText item7 = findViewById(R.id.item7price);
        String strItem7 = item7.getText().toString();
        num7 = Integer.parseInt(strItem7);

        int num8;
        setContentView(R.layout.activity_main);
        EditText item8 = findViewById(R.id.item8price);
        String strItem8 = item8.getText().toString();
        num8 = Integer.parseInt(strItem8);

        int num9;
        setContentView(R.layout.activity_main);
        EditText item9 = findViewById(R.id.item9price);
        String strItem9 = item9.getText().toString();
        num9 = Integer.parseInt(strItem9);

        int num10;
        setContentView(R.layout.activity_main);
        EditText item10 = findViewById(R.id.item10price);
        String strItem10 = item10.getText().toString();
        num10 = Integer.parseInt(strItem10);

        Button addButton = findViewById(R.id.addbutton);
        /*addButton.setOnClickListener(v -> {
            int sum;
            sum = num1 + num2 + num3;
        });*/
    }
}

