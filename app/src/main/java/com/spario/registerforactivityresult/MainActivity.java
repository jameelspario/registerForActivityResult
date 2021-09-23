package com.spario.registerforactivityresult;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main";
    CustomRegister customRegister;

    ActivityResultLauncher<String> mGetContent = registerForActivityResult(new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri uri) {
                        // Handle the returned Uri
                        if(uri!=null)
                            Log.e(TAG, uri.toString());
                    }
            });





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customRegister = new CustomRegister(getActivityResultRegistry());
        getLifecycle().addObserver(customRegister);

    }

    public void btn1(View view) {

        mGetContent.launch("image/*");
    }


    public void btn2(View view) {

        customRegister.selectImage();
    }


    ActivityResultLauncher<Integer> mStartForResult = registerForActivityResult(new CustomContract(), new ActivityResultCallback<Uri>() {
        @Override
        public void onActivityResult(Uri result) {
            if(result!=null)
                Log.e(TAG, result.toString());
        }
    });

    public void btn3(View view) {
        //mStartForResult.launch();

    }

    ActivityResultLauncher<Intent> mStartForResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent intent = result.getData();
                        // Handle the Intent
                        if(intent!=null){
                            String st = intent.getStringExtra("STR");
                            Log.e(TAG, st);
                        }
                    }
                }
            });

    public void btn4(View view) {
        mStartForResult2.launch(new Intent(this, ResultProducingActivity.class));
    }
}