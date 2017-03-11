package com.example.nblenovo.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
   Button btn;
    EditText et;
    ListView Lv;
    ArrayList<String> arrList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button)findViewById(R.id.btn);
        et= (EditText) findViewById(R.id.et);
        Lv= (ListView) findViewById(R.id.Lv);
        arrList = new ArrayList<>();
       adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrList);
        Lv.setAdapter(adapter);

        onBtnClick();

    }

    public void onBtnClick(){
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            String input =et.getText().toString();
                arrList.add(input);
                adapter.notifyDataSetChanged();


            }
        });



    }


}
