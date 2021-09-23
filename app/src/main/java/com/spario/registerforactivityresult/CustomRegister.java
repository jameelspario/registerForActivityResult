package com.spario.registerforactivityresult;

import android.net.Uri;
import android.util.Log;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;


/*
*
* mObserver = new MyLifecycleObserver(requireActivity().getActivityResultRegistry());
  getLifecycle().addObserver(mObserver);
*
*
* mObserver.selectImage();
*
* */
public class CustomRegister implements DefaultLifecycleObserver {

    private final ActivityResultRegistry mRegistry;
    private ActivityResultLauncher<String> mGetContent;

    CustomRegister(@NonNull ActivityResultRegistry registry) {
        mRegistry = registry;
    }

    public void onCreate(@NonNull LifecycleOwner owner) {
        // ...

        mGetContent = mRegistry.register("key", owner, new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri uri) {
                        // Handle the returned Uri
                        if(uri!=null){
                            Log.e("Custom", uri.toString());
                        }
                    }
                });
    }

    public void selectImage() {
        // Open the activity to select an image
        mGetContent.launch("image/*");
    }


}
