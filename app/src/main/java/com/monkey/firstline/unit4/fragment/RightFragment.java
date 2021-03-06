package com.monkey.firstline.unit4.fragment;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.monkey.firstline.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {
    private final String tag = getClass().getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag, "onCreateView");
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(tag, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(tag, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(tag, "onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tag, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }
}