package com.example.johannes.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Profile> listData = new ArrayList<Profile>();
        listData.add(new Profile(0, "Fendy", "Buah apa yang jatuh, tidak jauh dari pohonnya?", R.drawable.sepatu, R.drawable.circle_profile, "Buahaya", "Buahingg", "Buahtako", "Buapakmu"));
        listData.add(new Profile(1, "Mahatma", "Ini pertanyaan", R.drawable.benar, R.drawable.circle_profile, " ", " ", " ", " "));
        listData.add(new Profile(2, "Putra", "Ini pertanyaan", R.drawable.salah, R.drawable.circle_profile, " ", " ", " ", " "));
        listData.add(new Profile(3, "Lala", "Ini pertanyaan", R.drawable.eifel, R.drawable.circle_profile, " ", " ", " ", " "));
        listData.add(new Profile(4, "Ghana", "Ini pertanyaan", R.drawable.bg, R.drawable.circle_profile, " ", " ", " ", " "));
        listData.add(new Profile(5, "Intan", "Ini pertanyaan", R.drawable.salah, R.drawable.circle_profile, " ", " ", " ", " "));


        CustomAdapter listAdapter = new CustomAdapter(this, listData);
        ListView list_item_one = (ListView) findViewById(R.id.list_item_one);
        list_item_one.setAdapter(listAdapter);

        list_item_one.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}
