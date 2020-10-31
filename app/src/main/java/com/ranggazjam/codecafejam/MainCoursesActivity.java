package com.ranggazjam.codecafejam;

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

        Dish[] mainCourses = {
                new Dish("Broccoli and pancetta spaghetti", "Spagetti topped with a blend of fresh broccoli and smoked pancetta", 120),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Falafel and chicken burgers", "Tasty burgers made from falafel and free range chicken, served in a roll", 150),
                new Dish("Pear and karengo soup", "Fresh pears and karengo combined into chunky soup", 80),
                new Dish("Masa harina and bilberry salad", "Masa harina and fresh bilberry served on a bed of lettuce", 170),
                new Dish("Spinach and plantain crepes", "Fluffy crepes filled with fresh spinach and plantain", 90),
                new Dish("Apple and persimmon wontons", "Thin wonton cases stuffed with dessert apple and fresh persimmon", 125),
                new Dish("Cheese and barley soup", "Smoked cheese and barley combined into smooth soup", 185),
                new Dish("Potato and sweetcorn fritters", "Fluffy fritters filled with baby new potato and creamed sweetcorn", 250),
                new Dish("Cheese and barley risotto", "Creamy risotto rice with smoked cheese and barley", 230),
                new Dish("Milk chocolate and amaretto cheesecake", "A rich cheesecake layered with milk chocolate and amaretto", 230),
                new Dish("Pollack and socca salad", "A crisp salad featuring pollack and socca", 190),
                new Dish("Basil and turkey skewers", "Bamboo skewers loaded with dried basil and free-range turkey", 290)
        };
        ArrayAdapter<Dish> mainCourseAdapter = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item, mainCourses);


        mainCoursesList.setAdapter(mainCourseAdapter);
    }
}
