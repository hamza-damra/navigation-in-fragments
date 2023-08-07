package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM_LABEL = "ARG_PARAM_LABEL";
    private static final String ARG_PARAM_COLOR = "ARG_PARAM_COLOR";


    private String label;
    private int color;

    public SecondFragment() {
        // Required empty public constructor
    }


    public static SecondFragment newInstance(String label, int color) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM_LABEL, label);
        args.putInt(ARG_PARAM_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            label = getArguments().getString(ARG_PARAM_LABEL);
            color = getArguments().getInt(ARG_PARAM_COLOR);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView textView = view.findViewById(R.id.textViewSecondFragment);
        textView.setText(this.label);
        view.setBackgroundColor(this.color);
        // Inflate the layout for this fragment
        return view;
    }
}