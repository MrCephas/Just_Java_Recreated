package com.example.justjavarecreated;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
//import android.os.Bundle;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 0;
//    int price;

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view){
        int price = calculatePrice(quantity);
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayQuantity(int numberOfCoffees){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

//    /**
//     * this method displays the given quantity value on the screen
//     */
//    private void displayPrice(int number){
//      TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//    }

    /**
     * This method displays the given text on the screen
     *
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * this method increases the given quantity value on the screen
     */

    public void increment(View view){
//        int quantity = 2;
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * this method decreases the given quantity value on the screen
     */

    public void decrement(View view){
//        int quantity = 2;
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @return the price
     */

    private int calculatePrice(int quantity){
        int price = quantity * 5;
        return price;
    }

    /**
     * creates the order summary using the
     * @param price is input which is concatenated with the string
     *              returned by the method
     * @return the string containing price and quantity
     */

    private String createOrderSummary(int price){
        String priceMessage = "Name: Kaptain Kunal";
        priceMessage +=  "\nQuantity: " + quantity;
        priceMessage +=  "\nTotal: " + price;
        priceMessage += "\nThank you";
        return priceMessage;
    }


}