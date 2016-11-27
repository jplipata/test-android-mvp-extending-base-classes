package com.lipata.testproject_extending_activities_mvp.form_activities.updaterecord;

import com.lipata.testproject_extending_activities_mvp.R;
import com.lipata.testproject_extending_activities_mvp.form_activities.BaseFormActivity;

/**
 * Uses base UI and pre-populates with existing record's data
 */
public class UpdateActivity extends BaseFormActivity {

    @Override
    protected void onStart() {
        super.onStart();

        String firstName = getIntent().getStringExtra(getString(R.string.INTENT_EXTRA_FIRST_NAME));
        String lastName = getIntent().getStringExtra(getString(R.string.INTENT_EXTRA_LAST_NAME));
        populateFields(firstName, lastName);
    }

    void populateFields(String firstName, String lastName){

        textBox_firstName.setText(firstName);
        textBox_lastName.setText(lastName);

    }

    @Override
    protected void setPresenter() {
        presenter = new UpdatePresenter(this); // TODO Use dependency injection
    }
}
