package com.gemini.cloud.app.deeplinkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //打开main
    public void sendOpenMain(View view) {
        DeepLinkUtils.jumpApp(getApplication(), "myapplication://open/main?source=qudao74&refer=home1808_operation.chunyue.l_qudao74_007000_qErUFz_18080209");
    }


    //打开test
    public void sendOpenTest(View view) {
        DeepLinkUtils.jumpApp(getApplication(), "myapplication://open/test?source=qudao74&refer=home1808_operation.chunyue.l_qudao74_007000_qErUFz_18080209");
    }
}