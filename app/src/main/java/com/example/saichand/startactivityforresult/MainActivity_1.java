package com.example.saichand.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity_1 extends AppCompatActivity {
    TextView textView1, textView2, textView3;
    Button button;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout_1);
        textView1 = (TextView) findViewById(R.id.tv_main_name);
        textView2 = (TextView) findViewById(R.id.tv_main_age);
        textView3 = (TextView) findViewById(R.id.tv_main_gender);
        toolbar = (Toolbar) findViewById(R.id.tb_main_layout_1);
        button = (Button) findViewById(R.id.b_main_layout_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this, MainActivity_2.class);
                startActivityForResult(intent, 2);
            }
        });
        toolbar();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 ) {
            if(resultCode == 4){
            String name = data.getStringExtra("NAME");
            textView1.setText(name);
            String age = data.getStringExtra("AGE");
            textView2.setText(age);
            String gender = data.getStringExtra("GENDER");
            textView3.setText(gender);

        }}
    }

    public void toolbar() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.left_arrow);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity_1.this, "resume mode", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity_1.this, "restart  mode", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity_1.this, "Start mode", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity_1.this, "pause mode", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity_1.this, "stop mode", Toast.LENGTH_SHORT).show();
    }
}
