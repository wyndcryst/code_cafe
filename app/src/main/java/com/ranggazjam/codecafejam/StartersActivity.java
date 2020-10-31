package com.ranggazjam.codecafejam;

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

        Dish[] dishes = {
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Broccoli and pancetta spaghetti", "Spagetti topped with a blend of fresh broccoli and smoked pancetta", 120),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Broccoli and pancetta spaghetti", "Spagetti topped with a blend of fresh broccoli and smoked pancetta", 120),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Basil and turkey skewers", "Bamboo skewers loaded with dried basil and free-range turkey", 290)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }
}


/*
"Damson and mortadella salad"
Fresh damson and mortadella served on a bed of lettuce

"Champ and peach salad"
A crunchy salad featuring champ and fresh peach

"Cod and potato madras"
Medium-hot madras made with pacific cod and baby new potato

"Egg and grapefruit bagel"
"A warm bagel filled with free range eggs and pink grapefruit"

"Green cabbage and hazelnut salad"
A crisp salad featuring green cabbage and hazelnut

"Banana and coconut bread"
Crunchy bread made with fresh banana and coconut

"Chickpea and cheese burgers"
Succulent burgers made from fresh chickpea and cheese, served in a roll

"Tomato and pancetta pasta"
Fresh egg pasta in a sauce made from beef tomatoes and smoked pancetta
 */