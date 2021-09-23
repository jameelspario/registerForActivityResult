package com.spario.registerforactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResultProducingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_producing);
    }

    public void btn2(View view) {

        setResult(RESULT_OK, new Intent().putExtra("STR", "result"));
        finish();
    }
}