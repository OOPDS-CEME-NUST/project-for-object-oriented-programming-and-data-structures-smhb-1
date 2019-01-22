package com.example.khan.nustcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText Subject;
    private Button GO;
    private TextView welcome ;
    private ImageView Image;
    private TextView w ;
    private TextView e ;
    private TextView l ;
    private TextView p ;
    private TextView u ;
    private TextView k ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Subject = (EditText)findViewById(R.id.Subject);
        Image = (ImageView) findViewById(R.id.imageView4);
        welcome = (TextView)findViewById(R.id.Welcome);
        GO = (Button)findViewById(R.id.GO);
        w = (TextView)findViewById(R.id.textView);
        e = (TextView)findViewById(R.id.textView3);
        l = (TextView)findViewById(R.id.textView4);
        p = (TextView)findViewById(R.id.textView5);
        u = (TextView)findViewById(R.id.textView6);
        k = (TextView)findViewById(R.id.textView7);
        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(Subject.getText().toString());
            }
        });

    }



    private void click (String Subject) {
        if ((Subject.equals("Programming"))) {
            Intent intent = new Intent(SecondActivity.this, ThirdActvity.class);
            startActivity(intent);
        }
            else if((Subject.equals("Calculus"))) {
                Intent intent = new Intent(SecondActivity.this, Fourthactivity.class);
                startActivity(intent);
            }


        }
    }