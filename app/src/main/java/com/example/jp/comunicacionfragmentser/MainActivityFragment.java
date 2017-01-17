package com.example.jp.comunicacionfragmentser;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    Button boton;
    TextView texto1;
    static final int CODE = 1;// Codigo de solicitud

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_main, container, false);

        boton = (Button) vista.findViewById(R.id.bplay);
        texto1=(TextView)vista.findViewById(R.id.tv1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), Main2Activity.class);
                i.putExtra("Hola","Activity2");


                startActivityForResult(i,CODE          );
            }
        });

        return vista;


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODE) {

            if (resultCode == RESULT_OK) {

                String result=data.getStringExtra("llamar2");
                texto1.setText(result);

            }


        }
}
