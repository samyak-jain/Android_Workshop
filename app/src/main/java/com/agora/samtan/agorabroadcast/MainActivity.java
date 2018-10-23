package com.agora.samtan.agorabroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import io.agora.rtc.Constants;

public class MainActivity extends AppCompatActivity {

    public static final String channelMessage = "com.agora.samtan.agorabroadcast.CHANNEL";
    public static final String idMessage = "com.agora.samtan.agorabroadcast.APPID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSubmit(View view) {
        EditText appIDField = (EditText) findViewById(R.id.appid);
        String appID = appIDField.getText().toString();
        EditText channel = (EditText) findViewById(R.id.channelname);
        String channelName = channel.getText().toString();
        Intent intent = new Intent(this, VideoActivity.class);
        intent.putExtra(idMessage, appID);
        intent.putExtra(channelMessage, channelName);
        startActivity(intent);
    }
}
