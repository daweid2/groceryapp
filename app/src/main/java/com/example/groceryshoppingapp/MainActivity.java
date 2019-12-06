package com.example.groceryshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText[] items;
    private double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("sdfsdf","on create called");
        sum = 0;
        super.onCreate(savedInstanceState);
        int num1;
        setContentView(R.layout.activity_main);
        EditText item1 = findViewById(R.id.item1price);

        int num2;
        EditText item2 = findViewById(R.id.item2price);

        int num3;
        EditText item3 = findViewById(R.id.item3price);

        int num4;
        EditText item4 = findViewById(R.id.item4price);

        int num5;
        EditText item5 = findViewById(R.id.item5price);

        int num6;
        EditText item6 = findViewById(R.id.item6price);

        int num7;
        EditText item7 = findViewById(R.id.item7price);

        int num8;
        EditText item8 = findViewById(R.id.item8price);

        int num9;
        EditText item9 = findViewById(R.id.item9price);

        int num10;
        EditText item10 = findViewById(R.id.item10price);

        items = new EditText[]{item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};

        Button addButton = findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                for (int i = 0; i < items.length; i++) {
                    String itemS = items[i].getText().toString();
                    if (!itemS.equals("")) {
                        sum += Double.parseDouble(itemS);
                    }
                }
                TextView total = findViewById(R.id.total);
                total.setText("$" + sum);
            }
        });
    }
}

