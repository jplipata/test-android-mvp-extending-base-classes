package com.lipata.testproject_extending_activities.formActivities;

/**
 * Created by jlipata on 11/15/16.
 */

public abstract class BaseFormPresenter implements FormContract.Presenter {

    public FormContract.View view;

    public BaseFormPresenter(FormContract.View view) {
        this.view = view;
    }

    // Any shared Presenter actions can go here

}
