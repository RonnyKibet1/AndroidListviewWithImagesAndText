package codestart.info.androidlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import codestart.info.androidlistview.model.Planet;
import codestart.info.androidlistview.util.PlanetsAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private PlanetsAdapter planetsAdapter;
    private List<Planet> mPlanetList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        mListView = (ListView)findViewById(R.id.listview);

        //create new planet objects to add to planets list
        Planet mercury = new Planet(R.drawable.mercury, "Mercury");
        Planet venus = new Planet(R.drawable.venus, "Venus");
        Planet earth = new Planet(R.drawable.earth, "Earth");
        Planet mars = new Planet(R.drawable.mars, "Mars");
        Planet jupiter = new Planet(R.drawable.jupiter, "Jupiter");
        Planet saturn = new Planet(R.drawable.saturn, "Saturn");
        Planet uranus = new Planet(R.drawable.uranus, "Uranus");
        Planet neptune = new Planet(R.drawable.neptune, "Neptune");

        //add to list
        mPlanetList.add(mercury);
        mPlanetList.add(venus);
        mPlanetList.add(earth);
        mPlanetList.add(mars);
        mPlanetList.add(jupiter);
        mPlanetList.add(saturn);
        mPlanetList.add(uranus);
        mPlanetList.add(neptune);

        //use adapter to populate to homepage
        planetsAdapter = new PlanetsAdapter(this, mPlanetList);
        mListView.setAdapter(planetsAdapter);


    }
}
