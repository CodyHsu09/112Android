package com.example.counter2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSend(View view){
        EditText editName = (EditText) findViewById(R.id.editName);
        TextView txvShow = (TextView) findViewById(R.id.txvShow);
        String name = editName.getText().toString();
        txvShow.setText("你的名字是: " + name);
    }



    public void button_Click(View view){
        int count;
        TextView output = (TextView) findViewById(R.id.textView);
        count = Integer.parseInt(output.getText().toString());
        count++;
        output.setText(Integer.toString(count));
    }

    public void button2_Click(View view){
        TextView output = (TextView) findViewById(R.id.textView);
        output.setText(R.string.ini_value);
    }
}