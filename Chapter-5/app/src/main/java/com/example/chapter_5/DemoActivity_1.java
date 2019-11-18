package com.example.chapter_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DemoActivity_1 extends AppCompatActivity {

    private static final String TAG = "DemoActivity_1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_1);
        initView();
    }
    
    private void initView(){
        Toast.makeText(this, getIntent().getStringExtra("sid"), Toast.LENGTH_SHORT).show();
    }
}
