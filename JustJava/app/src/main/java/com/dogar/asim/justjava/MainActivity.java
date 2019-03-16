package com.dogar.asim.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity=0;
    int netPrice=5;
    int price=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quantity);
        String message="Total : $ "+price+"\nThank you!";
        displayMessage(message);
    }

    private void displayPrice(int number) {
        TextView priceTextView =  (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void display(int number) {
        TextView qunatityTextView =  (TextView) findViewById(R.id.quantity_text_view);
        qunatityTextView.setText(""+number);
    }
    private void displayMessage(String message){
        TextView priceTextView =  (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void increment(View view) {
        quantity++;
        display(quantity);
        price=quantity*netPrice;
        displayPrice(price);
    }
    public void decrement(View view) {
        if(quantity>0){
            quantity--;
            display(quantity);
            price=quantity*netPrice;
            displayPrice(price);
        }
    }
}
