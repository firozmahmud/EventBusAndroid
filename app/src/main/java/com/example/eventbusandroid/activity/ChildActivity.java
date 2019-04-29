package com.example.eventbusandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.eventbusandroid.R;
import com.example.eventbusandroid.model.MessageEvent;

import org.greenrobot.eventbus.EventBus;


public class ChildActivity extends AppCompatActivity {

    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        messageEditText = findViewById(R.id.messageEditText);
    }

    public void postMessage(View view) {
        EventBus.getDefault().postSticky(new MessageEvent(messageEditText.getText().toString()));
    }
}
