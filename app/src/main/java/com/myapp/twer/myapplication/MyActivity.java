package com.myapp.twer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.InjectView;


public class MyActivity extends Activity {

    @InjectView(R.id.button)
    Button button;

    @InjectView(R.id.hello_world)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                start2();
                textView.setText("Hello");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void start2() {
        Log.e("TAG", "start 2");
        Intent intent = new Intent();
        intent.setClass(this, MyActivity2.class);
        startActivity(intent);
    }
}
