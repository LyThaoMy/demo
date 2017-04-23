package com.mnchau.layoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();

        final Button btnClickMe = (Button) findViewById(R.id.button);
        final CheckBox chkYes = (CheckBox) findViewById(R.id.checkBox);

        btnClickMe.setText("Click Tui");
        btnClickMe.setVisibility(View.VISIBLE);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClickMe.setVisibility(View.INVISIBLE);
                chkYes.setEnabled(true);
            }
        });

        final Button btnGone = (Button) findViewById(R.id.button3);

        btnGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGone.setVisibility(View.GONE);
            }
        });

        final Button btnOther = (Button) findViewById(R.id.button4);

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnClickMe.getVisibility() != View.VISIBLE ||
                        btnGone.getVisibility() != View.VISIBLE) {
                    btnClickMe.setVisibility(View.VISIBLE);
                    btnGone.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(context, "Are you crazy???", Toast.LENGTH_LONG).show();

                    //Toast abc = Toast.makeText(context, "Are you crazy???", Toast.LENGTH_LONG);
                    //abc.show();
                }
            }
        });

        final Button btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, SecondActivity.class));
            }
        });
    }
}
