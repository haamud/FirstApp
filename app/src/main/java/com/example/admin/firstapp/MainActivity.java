package com.example.admin.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = (Button) findViewById(R.id.btn);
        final TextView textView = (TextView)findViewById(R.id.txtinfo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p = new PopupMenu(MainActivity.this,btn);
                p.getMenuInflater().inflate(R.menu.pop_up,p.getMenu());
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle().equals("Close")){
                            moveTaskToBack(true);
                            finish();
                        }

                        else
                        Toast.makeText(MainActivity.this, ""+textView.getText(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
            p.show();
            }
        });
    }
}
