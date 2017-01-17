package com.example.jp.comunicacionfragmentser;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    Button boton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista=inflater.inflate(R.layout.fragment_main, container, false);

        boton = (Button)vista.findViewById(R.id.bplay);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(),Main2Activity.class);

                Toast.makeText(getActivity(), "Activity 2", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
        });

        return vista;


    }
}
