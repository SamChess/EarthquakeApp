package com.example.earthquakeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    private ListView listView;
    private EarthquakeAdapter eAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<Earthquake> earthquakes=new ArrayList<>();
        earthquakes.add(new Earthquake("2.3","London","13/4/2019"));
        earthquakes.add(new Earthquake("5.1","Manchester","13/6/2015"));
        earthquakes.add(new Earthquake("4.2","Westlands","13/4/2019"));
        earthquakes.add(new Earthquake("7.3","Mombasa","13/4/2019"));
        earthquakes.add(new Earthquake("2.0","Delhi","13/4/2019"));
        earthquakes.add(new Earthquake("5.6","Dubai","13/4/2019"));
        earthquakes.add(new Earthquake("2.3","Rongai","13/4/2019"));
        earthquakes.add(new Earthquake("6.6","Nanyuki","13/4/2019"));
        earthquakes.add(new Earthquake("9.9","New York","13/4/2019"));
        earthquakes.add(new Earthquake("4.7","Mlolongo","13/4/2019"));


        eAdapter=new EarthquakeAdapter(this,earthquakes);

        listView.setAdapter(eAdapter);
    }
}
