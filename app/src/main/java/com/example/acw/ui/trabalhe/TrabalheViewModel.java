package com.example.acw.ui.trabalhe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrabalheViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TrabalheViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}