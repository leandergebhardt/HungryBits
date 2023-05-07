package com.leandergebhardt.hungrybits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = new Dish[]{
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 11.99),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 8.99),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 7.99),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 8.99),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 9.99),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 6.99),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 8.99),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 12.99),
                new Dish("Caesar salad", "Fresh chicken bits with cheese Caesar dressing.", 11.99),
                new Dish("Minestrone soup", "Simple yet delicious soup with pasta on the side.", 8.99),
                new Dish("Bruschetta", "Fresh bread with juicy tomatoes on top.", 7.99),
                new Dish("Caprese salad", "Freshly made Caprese salad.", 10.99),
                new Dish("Fried calamari", "calamari fried with small sald on the side.", 15.99),
                new Dish("Garlic bread", "Fresh bread with intense garlic.", 6.99),
                new Dish("Tomato soup", "A good simple tomato soup. Freshly prepared.", 8.99),
                new Dish("Avocado toast", "Sandwich with salad, tomatoes, cheese, avocado and self made sweet chilli souce.", 12.99)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dishes
        );

        startersList.setAdapter(dishesAdapter);
    }
}