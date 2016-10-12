package com.clay.pickthebus.pickthebus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onClickServiceButton(View view){
        Intent intent = new Intent(this, NameActivity.class);
        startActivity(intent);
    }

    public void onClickPassengerButton(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("IsPassenger",true);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}
