package com.yangtzeu.presenter;

import android.app.Activity;

import com.yangtzeu.model.ChangePassModel;
import com.yangtzeu.model.LoginModel;
import com.yangtzeu.ui.view.ChangePassView;
import com.yangtzeu.ui.view.LoginView;

public class ChangePassPresenter {
    private ChangePassModel model;
    private ChangePassView view;
    private Activity activity;

    public ChangePassPresenter(Activity activity, ChangePassView view) {
        this.view = view;
        this.activity = activity;
        model = new ChangePassModel();
    }

    public void changePassEvent() {
        model.changePassEvent(activity, view);
    }
}
