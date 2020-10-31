package com.ranggazjam.codecafejam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Broccoli and pancetta spaghetti", "Spagetti topped with a blend of fresh broccoli and smoked pancetta", 120),
                new Dish("Damson and mortadella salad", "Fresh damson and mortadella served on a bed of lettuce", 300),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185)

        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_checked, desserts);

        dessertsList.setAdapter(dessertsAdapter);

    }
}