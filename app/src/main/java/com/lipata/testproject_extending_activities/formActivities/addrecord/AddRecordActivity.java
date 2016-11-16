package com.lipata.testproject_extending_activities.formActivities.addrecord;

import com.lipata.testproject_extending_activities.formActivities.BaseFormActivity;

/**
 * Created by jlipata on 11/15/16.
 */

public class AddRecordActivity extends BaseFormActivity {

    @Override
    protected void setPresenter() {
        presenter = new AddRecordPresenter(this); // TODO Use dependency injection
    }
}
