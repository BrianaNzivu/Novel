package com.example.novel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }
    public void gotopage2(View view) {
        Intent Intent =new Intent (this,page2.class);
        startActivity(Intent);
    }
    public void gotohome(View view) {
        Intent Intent =new Intent (this,home.class);
        startActivity(Intent);
    }
}
