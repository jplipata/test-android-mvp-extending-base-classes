package com.lipata.testproject_extending_activities.formActivities;

/**
 * Created by jlipata on 11/16/16.
 */

public interface FormContract {

    interface View {

        void showToast(String text);

    }

    interface Presenter {

        void onClick_submit();

    }
}
