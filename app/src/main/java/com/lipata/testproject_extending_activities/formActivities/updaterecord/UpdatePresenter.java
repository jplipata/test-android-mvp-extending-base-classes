package com.lipata.testproject_extending_activities.formActivities.updaterecord;

import com.lipata.testproject_extending_activities.formActivities.BaseFormPresenter;
import com.lipata.testproject_extending_activities.formActivities.FormContract;

/**
 * Created by jlipata on 11/16/16.
 */

class UpdatePresenter extends BaseFormPresenter {


    public UpdatePresenter(FormContract.View view) {
        super(view);
    }

    @Override public void onClick_submit() {
        updateRecord();
    }

    private void updateRecord(){
        // Mock update
        view.showToast("Updating record...");
    }
}
