package com.mexico.quetzal.antojosapp.ui.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelInicio extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelInicio() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}