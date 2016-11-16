package com.lipata.testproject_extending_activities_mvp.form_activities.addrecord;

import com.lipata.testproject_extending_activities_mvp.form_activities.BaseFormActivity;

/**
 * Created by jlipata on 11/15/16.
 */

public class AddRecordActivity extends BaseFormActivity {

    @Override
    protected void setPresenter() {
        presenter = new AddRecordPresenter(this); // TODO Use dependency injection
    }
}
