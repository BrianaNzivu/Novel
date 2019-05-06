package com.example.novel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public void gotopage3(View view) {
        Intent Intent =new Intent (this,page3.class);
        startActivity(Intent);
    }
    public void gotopage1(View view) {
        Intent Intent =new Intent (this,page1.class);
        startActivity(Intent);
    }
}
