package com.example.application3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Instrument extends AppCompatActivity {

    String country[]={"Accordian","Flute","Guitar","Harp","Piano","Sitar","Viola","Violin","Harmonium","Jaltarang","Veena","Tanpura","RudraVeena","SaraswatiVeena","SagarVeena"};
    int flag[]={R.drawable.accordian,R.drawable.flute,R.drawable.guitar,R.drawable.harp,R.drawable.piano,R.drawable.sitar,R.drawable.voila,R.drawable.violin,R.drawable.harmonium,R.drawable.jaltarang,R.drawable.veena,R.drawable.tanpura,R.drawable.rudraveena,R.drawable.saraswativeena,R.drawable.sagar};

    ListView simpleListView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView simpleListView = (ListView) findViewById(R.id.list);
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<country.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
            hashMap.put("name",country[i]);
            hashMap.put("image",flag[i]+"");
            arrayList.add(hashMap);//add the hashmap into arrayList
        }
        String[] from={"name","image"};//string array
        int[] to={R.id.label,R.id.imageview1};//int array of views id's
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.activity_listview,from,to);//Create object and set the parameters for simpleAdapter

        simpleListView.setAdapter(simpleAdapter);//sets the adapter for listView

        //perform listView item click event
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                //To redirect in next page
                Intent i2 = new Intent(Instrument.this, Detail.class);
                i2.putExtra("name", country[i]);
                startActivity(i2);

                Toast.makeText(getApplicationContext(),country[i],Toast.LENGTH_LONG).show();

                //show the selected image in toast according to position
            }
        });
    }


}

//        ListView listView = (ListView) findViewById(R.id.list);
//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                R.layout.activity_listview,R.id.label, country);
//
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        String value=adapter.getItem(position);
//
//        //To redirect in next page
//        Intent i=new Intent(MainActivity.this,Activity2.class);
//        i.putExtra("name",value);
//        startActivity(i);
//
//        Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
//
//
//    }
//});
//       }
//}
