package com.example.project10_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends Activity {
    private Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
        initLr();
    }
    public void init(){
        btnReturn = findViewById(R.id.btnReturn);
    }

    public void initLr(){
        btnReturn.setOnClickListener(v -> {
            finish();
        });
    }
}
