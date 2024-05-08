package com.example.a0207.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a0207.R;
import com.example.a0207.databinding.FragmentHomeBinding;

public class FirstActivity extends Fragment {
    private FragmentHomeBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.vkaldka4, container, false );
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
