package com.example.mark.publishproguard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mark.publishproguard.content.People;

public class DetailActivity extends AppCompatActivity {

    TextView mText;
    TextView mTextGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mText =(TextView) findViewById(R.id.text_detail);
        mTextGson =(TextView) findViewById(R.id.text_gson);


        People p = getIntent().getParcelableExtra("data-people");

        mText.setText(p.toString()+p.getClass().getName());

        mTextGson.setText(getIntent().getStringExtra("data-json"));

    }
}
