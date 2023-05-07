package com.leandergebhardt.hungrybits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView dessertsListView = findViewById(R.id.list_view_desserts);

        Dish[] dessertDishes = new Dish[] {
                new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 4.99),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 6.99),
                new Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 5.99),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 5.99),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 4.99),
        };

        ArrayAdapter<Dish> dessertAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dessertDishes
        );
        dessertsListView.setAdapter(dessertAdapter);
    }
}