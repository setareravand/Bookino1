package com.example.bookino.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.bookino.base.BaseFragment;
import com.example.bookino.databinding.FragmentSearchBinding;

public class SearchFragment extends BaseFragment {

    private FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentSearchBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}