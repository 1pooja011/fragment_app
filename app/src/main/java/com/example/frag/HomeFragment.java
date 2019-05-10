package com.example.frag;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class HomeFragment extends Fragment {
    public RecyclerView recyclerView;
    private RecyclerView.Adapter myadapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        String[] mydataset = {"Gangour ghat", "City Palace", "Fatehsagar", "Ambrai", "Jag mandir", "udaisagar", "boho cafe", "pichola"};
        recyclerView.setAdapter(myadapter);

    }
}

