package com.example.qwerty.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mAdd;
    private EditText metFirst, metSecond;
    private TextView mDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mAdd = (Button)findViewById(R.id.btnAdd);
        metFirst = (EditText)findViewById(R.id.etFirst);
        metSecond = (EditText)findViewById(R.id.etSecond);
        mDisplay = (TextView)findViewById(R.id.tvDisplay);

        mAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
        mDisplay.setText(String.valueOf(Float.parseFloat(metFirst.getText().toString()) + Float.parseFloat(metSecond.getText().toString())));
        }
        catch(Exception e)
        {
            mDisplay.setText("Invalid Input");
        }
    }
}
