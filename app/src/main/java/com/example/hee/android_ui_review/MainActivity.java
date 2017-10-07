package com.example.hee.android_ui_review;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.viewportHeight;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn1
        final Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_1, Toast.LENGTH_SHORT).show();
                ;
            }
        });

        //btn2
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_2, Toast.LENGTH_SHORT).show();
            }
        });

        //btn3
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_3, Toast.LENGTH_SHORT).show();
            }
        });

        //btn4
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_4, Toast.LENGTH_SHORT).show();

                if (btn1.getText().equals("Button 1"))
                    btn1.setText("Button One");
                else if (btn1.getText().equals("Button One"))
                    btn1.setText("Button 1");
                return;
            }
        });

        //btn5
        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_5, Toast.LENGTH_SHORT).show();
                LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                layout.setGravity(Gravity.CENTER_HORIZONTAL);
            }
        });

        //btn6
        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg_6, Toast.LENGTH_SHORT).show();
                LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                layout.setPadding(20,20,20,20);
            }
        });
    }
}


      /*  Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new MyOnClickListener());

        Button btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new MyOnClickListener());

        Button btn3 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new MyOnClickListener());

        }*/

    /*private class MyOnClickListener implements
            View.OnClickListener {
        public void onClick(View view) {
            if (view.getId() == R.id.button1){
                Toast.makeText(getApplicationContext(),
                        R.string.button_clicked_msg_1,
                        Toast.LENGTH_SHORT).show();
            }else if (view.getId() == R.id.button2){
                Toast.makeText(getApplicationContext(),
                        R.string.button_clicked_msg_2,
                        Toast.LENGTH_SHORT).show();
            }else if(view.getId() == R.id.button3){
                Toast.makeText(getApplicationContext(),
                        R.string.button_clicked_msg_3,
                        Toast.LENGTH_SHORT).show();
            }



        }
    }
}*/

