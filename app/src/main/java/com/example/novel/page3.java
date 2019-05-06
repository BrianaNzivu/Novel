package com.example.novel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
    public void gotopage4(View view) {
        Intent Intent =new Intent (this,page4.class);
        startActivity(Intent);
    }
    public void gotopage2(View view) {
        Intent Intent =new Intent (this,page2.class);
        startActivity(Intent);
    }
}
