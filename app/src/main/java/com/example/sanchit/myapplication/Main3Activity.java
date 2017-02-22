package com.example.sanchit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();
        Bundle b=i.getExtras();
        String s = b.getString("ab");
        TextView t = (TextView)findViewById(R.id.textView5);
        t.setText(s);

    }
}
