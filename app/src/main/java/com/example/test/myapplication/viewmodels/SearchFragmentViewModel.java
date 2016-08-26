package com.example.test.myapplication.viewmodels;

import android.content.Context;

import com.example.test.myapplication.TestApp;
import com.example.test.myapplication.rest.ApiService;
import com.example.test.myapplication.viewmodels.widgets.EditTextViewModel;

import javax.inject.Inject;

/**
 * Created by test on 26/08/16.
 */

public class SearchFragmentViewModel {

    @Inject
    ApiService apiService;

    public EditTextViewModel searchText;

    public SearchFragmentViewModel(Context context){
        initWidgets();
        if(context != null){
            ((TestApp) context.getApplicationContext()).getNetComponent().inject(this);
        }
    }

    private void initWidgets() {
        searchText = new EditTextViewModel("siema");
    }
}
