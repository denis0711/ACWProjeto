package com.example.acw.ui.orcamento;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.acw.R;

public class OrcamentoFragment extends Fragment {

    private OrcamentoViewModel orcamentoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        orcamentoViewModel =
                new ViewModelProvider(this).get(OrcamentoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_orcamento, container, false);
        final TextView textView = root.findViewById(R.id.text_orcamento);
        orcamentoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}