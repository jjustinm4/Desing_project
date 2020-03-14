package com.hyperbeast.cec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class navigation_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_menu);
        Button classChatButon = (Button) findViewById(R.id.class_chat_nav);
        classChatButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classButton = new Intent(navigation_menu.this, class_chatActivity.class);
                startActivity(classButton);
            }
        });
    }
}
