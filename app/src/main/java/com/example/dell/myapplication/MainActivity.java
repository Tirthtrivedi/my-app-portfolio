package com.example.dell.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btn_spot, btn_scores, btn_library, btn_build, btn_xyz, btn_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();


    }

    private void initialise() {

        btn_spot = (Button) findViewById(R.id.button1);
        btn_scores = (Button) findViewById(R.id.button2);
        btn_library = (Button) findViewById(R.id.button3);
        btn_build = (Button) findViewById(R.id.button4);
        btn_xyz = (Button) findViewById(R.id.button5);
        btn_capstone = (Button) findViewById(R.id.button6);

        btn_spot.setOnClickListener(this);
        btn_scores.setOnClickListener(this);
        btn_library.setOnClickListener(this);
        btn_build.setOnClickListener(this);
        btn_xyz.setOnClickListener(this);
        btn_capstone.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:

                Toast.makeText(this, "This button will launch SPOTIFY STREAMER APP", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:

                Toast.makeText(this, "This button will launch SCORES STREAMER APP", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:

                Toast.makeText(this, "This button will launch LIBRARY STREAMER APP", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:

                Toast.makeText(this, "This button will launch BUILD IT BIGGER  APP", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:

                Toast.makeText(this, "This button will launch XYZ READER APP", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:

                Toast.makeText(this, "This button will launch MY CAPSTONE APP", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}