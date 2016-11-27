package com.lipata.testproject_extending_activities_mvp.form_activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lipata.testproject_extending_activities_mvp.R;

/**
 * Base UI form that uses R.layout.activity_base_form.  It has 2 text input fields that can either be
 * created as blank ("new record" use case), or can be pre-populated ("update record" use case)
 */
public abstract class BaseFormActivity extends AppCompatActivity implements FormContract.View {

    protected FormContract.Presenter presenter;

    protected EditText textBox_firstName;
    protected EditText textBox_lastName;
    protected Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_form);

        textBox_firstName = (EditText) findViewById(R.id.editText_first_name);
        textBox_lastName = (EditText) findViewById(R.id.editText_last_name);
        button_submit = (Button) findViewById(R.id.button_submit);

        setPresenter();

        button_submit.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                presenter.onClick_submit();
            }
        });
    }

    @Override public void showToast(String text){ // This has to be `public` in order to avoid access errors
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    protected abstract void setPresenter();
}
