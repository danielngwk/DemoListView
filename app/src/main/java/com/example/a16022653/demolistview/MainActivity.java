package com.example.a16022653.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.lvFood);

        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee",false));
        food.add(new Food("Rockey Choc",true));
        food.add(new Food("Kid Cat Choc",true));

        aa = new FoodAdapter(this,R.layout.row, food);
        lv.setAdapter(aa);
    }
}
