package com.example.saichand.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;

public class MainActivity_3 extends AppCompatActivity {
    EditText editText1, editText2, editText3;
    Button button;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout_3);
        editText1 = (EditText) findViewById(R.id.et_main_name);
        editText2 = (EditText) findViewById(R.id.et_main_age);
        editText3 = (EditText) findViewById(R.id.et_main_gender);
        toolbar =(Toolbar) findViewById(R.id.tb_main_layout_3);
        button = (Button) findViewById(R.id.b_main_layout_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                String age = editText2.getText().toString();
                String gender = editText3.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("NAME",name);
                intent.putExtra("AGE",age);
                intent.putExtra("GENDER",gender);
                setResult(2,intent);
                finish();

            }
        });
        toolbar();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void toolbar(){
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.left_arrow);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
