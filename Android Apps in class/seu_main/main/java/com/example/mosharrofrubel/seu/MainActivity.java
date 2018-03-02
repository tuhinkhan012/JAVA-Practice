package com.example.mosharrofrubel.seu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.my_signin);
        final EditText name = (EditText) findViewById(R.id.et_name);

        final TextView tv = (TextView) findViewById(R.id.tv);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s = name.getText().toString();

                Toast.makeText(MainActivity.this, "Your name is: "+s, Toast.LENGTH_SHORT).show();


                tv.setText("Name: "+s);


            }
        });

    }
}
