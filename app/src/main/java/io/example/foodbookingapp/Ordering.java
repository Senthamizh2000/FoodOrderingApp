package io.example.foodbookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ordering extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button placeOrder;
    TextView billAmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordering);

        cb1 = findViewById(R.id.pizza);
        cb2 = findViewById(R.id.burger);
        cb3 = findViewById(R.id.coke);
        cb4 = findViewById(R.id.briyani);
        cb5 = findViewById(R.id.sandwich);

        placeOrder = findViewById(R.id.place_order);

        billAmt = findViewById(R.id.bill);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int total_Bill = 0;

                if(cb1.isChecked()){
                    total_Bill += 119;
                }
                if(cb2.isChecked()){
                    total_Bill += 99;
                }
                if(cb3.isChecked()){
                    total_Bill += 49;
                }
                if(cb4.isChecked()){
                    total_Bill += 199;
                }
                if(cb5.isChecked()){
                    total_Bill += 129;
                }
                else{
                    billAmt.setText("please add our delicious Items");
                }

                billAmt.setText("Adds up to Rs. " + String.valueOf(total_Bill));

                Toast.makeText(Ordering.this, "Order Placed", Toast.LENGTH_LONG).show();
            }
        });

    }


}