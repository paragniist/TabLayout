package com.example.vinove.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vinove on 27/2/18.
 */

public class EightFragment extends android.support.v4.app.Fragment {

    View view;

    public EightFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.item_eight, container, false);

        return view;

    }
}
