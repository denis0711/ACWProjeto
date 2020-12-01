package com.example.acw.ui.orcamento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrcamentoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrcamentoViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}