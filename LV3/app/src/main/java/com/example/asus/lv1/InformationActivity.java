package com.example.asus.lv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InformationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent intent1= getIntent();
        String[] data=intent1.getStringArrayExtra("case");
        ArrayAdapter<String> adpter=new ArrayAdapter<String>(InformationActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView) findViewById(R.id.list2);
        listView.setAdapter(adpter);
    }
}
