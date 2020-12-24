package com.example.android.quake_report;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;


/**
 * This Earthquake Activity is the main screen for our app
 */
public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        //A temporary list of earthquake locations
        // this is basically placeholder data

        ArrayList<Quake> earthquakes = new ArrayList<>();

        earthquakes.add( new Quake( "San Francisco", new Date(), 1.2) );
        earthquakes.add( new Quake( "London", new Date(), 1.1) );
        earthquakes.add( new Quake( "Tokyo", new Date(), 1.5 ) );
        earthquakes.add( new Quake( "Mexico", new Date(), 2.5 ));
        earthquakes.add( new Quake( "Rio de Janerio", new Date(), 1.5 ) );
        earthquakes.add( new Quake( "Paris", new Date(), 1.7 ) );

        //Find a reference to the Listview in the layout
        ListView earthquakeListView = ( ListView ) findViewById( R.id.list );


        //Create new QuakeAdapter of lists
         QuakeAdapter adapter = new QuakeAdapter( this, earthquakes );
         earthquakeListView.setAdapter(
                 adapter );

    }
}