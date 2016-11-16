package com.lipata.testproject_extending_activities_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.lipata.testproject_extending_activities_mvp.form_activities.addrecord.AddRecordActivity;
import com.lipata.testproject_extending_activities_mvp.form_activities.updaterecord.UpdateActivity;


/**
 * This is just a navigation screen.  See package `formActivities` for MVP architecture extending base classes
 */
public class MainActivity extends AppCompatActivity {

    // Mock data
    String firstName = "John";
    String lastName = "Doe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button_add = (Button) findViewById(R.id.add_record);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddRecordActivity.class);
                startActivity(intent);
            }
        });

        Button button_update = (Button) findViewById(R.id.update_record);
        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UpdateActivity.class);
                intent.putExtra(getString(R.string.INTENT_EXTRA_FIRST_NAME), firstName);
                intent.putExtra(getString(R.string.INTENT_EXTRA_LAST_NAME), lastName);
                startActivity(intent);
            }
        });
    }

}
