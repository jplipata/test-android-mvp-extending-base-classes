package com.lipata.testproject_extending_activities.formActivities.addrecord;

import com.lipata.testproject_extending_activities.formActivities.BaseFormPresenter;
import com.lipata.testproject_extending_activities.formActivities.FormContract;

/**
 * Created by jlipata on 11/16/16.
 */

class AddRecordPresenter extends BaseFormPresenter{

    AddRecordPresenter(FormContract.View view) {
        super(view);
    }

    @Override public void onClick_submit() {
        addRecord();
    }

    private void addRecord() {
        // Mock adding record
        view.showToast("Adding recording...");
    }
}
