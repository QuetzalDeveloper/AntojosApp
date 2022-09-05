package com.mexico.quetzal.antojosapp.ui.categoria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mexico.quetzal.antojosapp.databinding.FragmentoCategoriaBinding;

public class FragmentoCategoria extends Fragment {

    private FragmentoCategoriaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelCategoria viewModelCategoria =
                new ViewModelProvider(this).get(ViewModelCategoria.class);

        binding = FragmentoCategoriaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        viewModelCategoria.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}