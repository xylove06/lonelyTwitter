package com.example.runqiwang.fueltrack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends Activity {
    private static final String FILENAME = "logfile.bin";
    private ListView AllRecord;

    private static ArrayList<Product> products = new ArrayList<Product>();
    private ArrayAdapter<Product> adapter;

    public static ArrayList<Product> getEntry() {
        return products;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AllRecord = (ListView) findViewById(R.id.listView);
        AllRecord.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, edit.class);
                Product entry = adapter.getItem(position);
                intent.putExtra("logItemEdit", entry);
                intent.putExtra("logKey", position);
                startActivity(intent);

            }
        });


        Button ADDButton = (Button) findViewById(R.id.main_add);
        Button ClearButton = (Button) findViewById(R.id.main_clear);
        ADDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                startActivity(new Intent(MainActivity.this, add.class));
            }
        });
        ClearButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setResult(RESULT_OK);
                products.clear();
                adapter.notifyDataSetChanged();
                saveInFile();

            }
        });
    }
        @Override
        protected void onStart() {
            // TODO Auto-generated method stub
            super.onStart();
            saveInFile();
            loadFromFile();
            adapter = new ArrayAdapter<Product>(this, R.layout.list_item, products);
            AllRecord.setAdapter(adapter);
        }
        //load the file
        private void loadFromFile() {
            try {
                FileInputStream fis = openFileInput(FILENAME);
                BufferedReader in = new BufferedReader(new InputStreamReader(fis));
                Gson gson = new Gson();

                // Took from https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/Gson.html 01-19 2016
                Type listType = new TypeToken<ArrayList<Product>>() {}.getType();
                products = gson.fromJson(in, listType);
                fis.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                products = new ArrayList<Product>();
            }catch (IOException e) {
                // TODO Auto-generated catch block
                throw new RuntimeException();
            }
        }
    //save the file
    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
            Gson gson = new Gson();
            gson.toJson(products, out);
            out.flush();
            fos.close();
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        }
    }
}