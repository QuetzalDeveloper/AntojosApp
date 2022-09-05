package com.mexico.quetzal.antojosapp.ui.categoria;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelCategoria extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelCategoria() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}