package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List <Character> characters= getCharacters();

        CharacterAdapter characterAdapter = new CharacterAdapter(characters);
        RecyclerView recyclerView = findViewById(R.id.characters_recycler_view);
        recyclerView.setAdapter(characterAdapter);
    }

    private List<Character> getCharacters(){
        ArrayList <Character> characters= new ArrayList<>();
        characters.add(new Character("Bacon Mushroom Burgers", R.drawable.burger));
        characters.add(new Character("Roasted Half Chicken", R.drawable.chicken));
        characters.add(new Character("Fish Fillet", R.drawable.fish));
        characters.add(new Character("French Fries", R.drawable.fries));
        characters.add(new Character("Famous Southern Salad", R.drawable.italian_salad));
        characters.add(new Character("Double Elbow Pasta", R.drawable.pasta));
        characters.add(new Character("Chicken BBQ Pizza", R.drawable.pizza));
        characters.add(new Character("Steak With Mushroom", R.drawable.steak));

        /*
        characters.add(new Character("Burger", R.drawable.burger, "100"));
        characters.add(new Character("Chicken", R.drawable.chicken, "120"));
        characters.add(new Character("French Fish", R.drawable.fish, "110"));
        characters.add(new Character("Fries", R.drawable.fries, "25"));
        characters.add(new Character("Italian Salad", R.drawable.italian_salad, "40"));
        characters.add(new Character("Pasta", R.drawable.pasta, "75"));
        characters.add(new Character("Pizza", R.drawable.pizza,"90"));
        characters.add(new Character("Steak", R.drawable.steak, "200"));

         */
        return characters;
    }

}