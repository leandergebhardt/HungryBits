package com.leandergebhardt.hungrybits;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainDishes = new Dish[]{
                new Dish("Vegetarian lasagna", "lasagna with cashew nuts and smoked soy.", 14.99),
                new Dish("Mushroom risotto", "Shiitake with fresh risotto rice.", 17.99),
                new Dish("Tandoori chicken with naan bread", "Fruity flavored chicken.", 16.99),
                new Dish("Pad Thai with chicken or shrimp", "Simple Pad Thai with soft chicken and fresh shrimp.", 18.99),
                new Dish("Grilled lamb chops with mint sauce", "Freeland lamb with self made mint orange marinade.", 32.99),
                new Dish("Beef fajitas with guacamole and sour cream", "fresh Fajitas.", 27.99),
                new Dish("Chicken parmesan with pasta", "Freeland chicken with italian parmesano.", 16.99),
                new Dish("Seafood paella", "Spanish classic prepared with shrimp and fresh paella.", 26.99),
                new Dish("Teriyaki-glazed salmon with steamed rice and vegetables.", "Fancy, shmancy.", 37.99),
                new Dish("Grilled salmon with lemon and herbs", "Freshly prepared fish dish marinaded in lemon and herbs marinade.", 34.99),
                new Dish("Spaghetti Bolognese", "Yet simple but delicious pasta.", 12.99),
                new Dish("Beef stir-fry with vegetables", "Beef from freeland cows with beans and peppers.", 17.99),
                new Dish("Roast chicken with vegetables", "Fresh chicken with beans and peppers.", 18.99),
                new Dish("Beef lasagna", "7 layered lasagne with biological ground beef.", 19.99),
                new Dish("Fish and chips", "The english classic.", 16.99),
                new Dish("Chicken curry with rice", "Fresh chicken bits with green korean curry paste sauce.", 18.99),
                new Dish("Grilled steak with roasted potatoes", "Beef from freeland cows.", 12.99),
                new Dish("Shrimp scampi with linguine", "Scampi with self made cocktail sauce dip on the side.", 11.99),
                new Dish("Beef stew with dumplings", "Dumplings filled with mushrooms and chestnut and beef from freeland cows.", 28.99),
                new Dish("Pan-seared duck breast with cherry sauce", "Duck breast cooked in self made cherry sauce", 27.99),
        };

        ArrayAdapter<Dish> mainDishesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                mainDishes
        );

        mainCoursesList.setAdapter(mainDishesAdapter);
    }
}
