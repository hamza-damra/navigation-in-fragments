package com.example.fragments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    private static final String ARG_PARAM_LABEL = "ARG_PARAM_LABEL";
    private static final String ARG_PARAM_COLOR = "ARG_PARAM_COLOR";


    private String label;
    private int color;

    public FirstFragment() {
        // Required empty public constructor
    }


    public static FirstFragment newInstance(String label, int color) {
        FirstFragment fragment = new FirstFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        TextView textView = view.findViewById(R.id.textViewFirstFragment);
        textView.setText(this.label);
        view.setBackgroundColor(this.color);
        return view;

    }
}