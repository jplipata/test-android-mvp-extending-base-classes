package com.lipata.testproject_extending_activities_mvp.form_activities.addrecord;

import com.lipata.testproject_extending_activities_mvp.form_activities.BaseFormPresenter;
import com.lipata.testproject_extending_activities_mvp.form_activities.FormContract;

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
