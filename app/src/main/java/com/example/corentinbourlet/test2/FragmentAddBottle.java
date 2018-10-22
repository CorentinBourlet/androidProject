package com.example.corentinbourlet.test2;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentAddBottle extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        Button buttonBottle = (Button) findViewById(R.id.buttonAddBottle);
        buttonBottle.setOnClickListener(this);

        Button buttonchecklist = (Button) findViewById(R.id.checkList);
        buttonchecklist.setOnClickListener(this);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_main, container, false);
    }
}