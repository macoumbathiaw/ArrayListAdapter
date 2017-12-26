package com.example.mthiaw.arraylistadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare the ArrayList
        ArrayList<String> animal = new ArrayList<>();

        //Add animal into the ArrayList
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("crocodile");
        animal.add("Chiken");
        animal.add("Monkey");

        //Find the ListView ID and place it into the listViewtView
        ListView listViewView = (ListView) findViewById(R.id.list_view_ID);

        //Create an ArrayAdapter
        ArrayAdapter<String> arrayAdapterForTheAnimalNames = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, animal);

        //use a for loop to print all of the animal names into the ListView

        for (int index = 0; index < animal.size(); index++){

            //Create a TextView to place the animal names into it
            TextView textViewToPlaceAnimalNames = new TextView(this);

            //Place the Animal Names in the index of the ArrayList
            textViewToPlaceAnimalNames.setText(animal.get(index));


            //Place the ListView into the adapter
            listViewView.setAdapter(arrayAdapterForTheAnimalNames);

        }






    }
}
