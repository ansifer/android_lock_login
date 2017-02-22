package com.example.sanchit.myapplication;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i=0;
    EditText e1;
    EditText e2;
    public void onButtonClick(View v)
    {
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        final TextView mTextField = (TextView)findViewById(R.id.textView6);
        String a = e1.getText().toString();
        String b = e2.getText().toString();
        if(a.equals("sanchit")&&b.equals("s"))
        {
            i=0;
            Intent i1 = new Intent(MainActivity.this,Main3Activity.class);
            Bundle c= new Bundle();
            c.putString("ab",a);
            i1.putExtras(c);
            startActivity(i1);
            Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
            i=i+1;
            if(i==3)
            {
                e1.setEnabled(false);
                e2.setEnabled(false);
                new CountDownTimer(30000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        mTextField.setText("Seconds Remaining: " + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        mTextField.setText("");
                        e1.setEnabled(true);
                        e2.setEnabled(true);
                        i=0;
                    }
                }.start();
            }
        }
    }
}
